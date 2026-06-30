package com.kidssleep.presentation.navigation

import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument
import com.kidssleep.ads.AdManager
import com.kidssleep.analytics.AnalyticsManager
import com.kidssleep.domain.model.UserPreferences
import com.kidssleep.presentation.ui.screens.consent.ConsentScreen
import com.kidssleep.presentation.ui.screens.home.HomeScreen
import com.kidssleep.presentation.ui.screens.onboarding.OnboardingScreen
import com.kidssleep.presentation.ui.screens.settings.SettingsScreen
import com.kidssleep.presentation.ui.screens.sleep.StoryListScreen
import com.kidssleep.presentation.ui.screens.sleep.StoryReaderScreen
import com.kidssleep.presentation.ui.screens.sleep.TimerScreen

sealed class Screen(val route: String) {
    data object Consent : Screen("consent")
    data object Onboarding : Screen("onboarding")
    data object Home : Screen("home")
    data object Stories : Screen("stories")
    data object Story : Screen("story/{storyId}") {
        fun open(storyId: Int) = "story/$storyId"
    }
    data object Timer : Screen("timer")
    data object Settings : Screen("settings")
}

@Composable
fun KidsSleepNavHost(
    navController: NavHostController,
    adManager: AdManager,
    analyticsManager: AnalyticsManager,
    preferences: UserPreferences,
    startDestination: String
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    DisposableEffect(navBackStackEntry?.destination?.route) {
        navBackStackEntry?.destination?.route?.let { analyticsManager.logScreenView(it) }
        onDispose { }
    }

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Consent.route) {
            ConsentScreen(onComplete = {
                navController.navigate(Screen.Onboarding.route) { popUpTo(Screen.Consent.route) { inclusive = true } }
            })
        }
        composable(Screen.Onboarding.route) {
            OnboardingScreen(onComplete = {
                navController.navigate(Screen.Home.route) { popUpTo(Screen.Onboarding.route) { inclusive = true } }
            })
        }
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToStories = { navController.navigate(Screen.Stories.route) },
                onNavigateToTimer = { navController.navigate(Screen.Timer.route) },
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) },
                adManager = adManager,
                adsEnabled = preferences.adsEnabled
            )
        }
        composable(Screen.Stories.route) {
            StoryListScreen(
                onNavigateBack = { navController.navigateUp() },
                onOpenStory = { navController.navigate(Screen.Story.open(it)) }
            )
        }
        composable(
            route = Screen.Story.route,
            arguments = listOf(navArgument("storyId") { type = NavType.IntType })
        ) { entry ->
            val storyId = entry.arguments?.getInt("storyId") ?: 1
            val context = LocalContext.current
            val activity = context as? android.app.Activity
            StoryReaderScreen(
                storyId = storyId,
                soundEnabled = preferences.soundEnabled,
                useBundledAudio = preferences.useBundledAudio,
                learningLanguage = preferences.learningLanguage,
                onNavigateBack = {
                    if (activity != null) {
                        adManager.maybeShowInterstitialAd(activity) { navController.navigateUp() }
                    } else {
                        navController.navigateUp()
                    }
                }
            )
        }
        composable(Screen.Timer.route) {
            TimerScreen(onNavigateBack = { navController.navigateUp() })
        }
        composable(Screen.Settings.route) {
            val context = LocalContext.current
            SettingsScreen(
                onNavigateBack = { navController.navigateUp() },
                onNavigateToPrivacy = {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://kidssleep.game/privacy")))
                }
            )
        }
    }
}
