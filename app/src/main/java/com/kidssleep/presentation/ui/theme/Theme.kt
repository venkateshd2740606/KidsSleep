package com.kidssleep.presentation.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.kidssleep.domain.model.AppTheme
import com.kidssleep.domain.model.ColorBlindMode

data class PuzzleGameColors(
    val plateDefault: Color,
    val plateFallen: Color,
    val screwActive: Color,
    val screwBlocked: Color,
    val screwRemoved: Color,
    val boardBackground: Color
)

val LocalPuzzleGameColors = staticCompositionLocalOf {
    PuzzleGameColors(PlateShadow, ScrewRemoved, ScrewMetal, Color(0xFFEF5350), ScrewRemoved, NightSurface)
}

@Composable
fun KidsSleepTheme(
    appTheme: AppTheme = AppTheme.DARK,
    highContrast: Boolean = false,
    colorBlindMode: ColorBlindMode = ColorBlindMode.NONE,
    fontScale: Float = 1.0f,
    content: @Composable () -> Unit
) {
    val systemDark = isSystemInDarkTheme()
    val resolvedTheme = when (appTheme) {
        AppTheme.SYSTEM -> AppTheme.DARK
        else -> appTheme
    }

    val colorScheme = when (resolvedTheme) {
        AppTheme.LIGHT -> lightColorScheme(
            primary = LightPrimary, onPrimary = LightOnPrimary, primaryContainer = LightPrimaryContainer,
            secondary = LightSecondary, surface = LightSurface, background = LightBackground, error = LightError
        )
        else -> darkColorScheme(
            primary = DarkPrimary, onPrimary = DarkOnPrimary, primaryContainer = DarkPrimaryContainer,
            secondary = DarkSecondary, surface = DarkSurface, background = DarkBackground, error = DarkError
        )
    }

    val accent = when (colorBlindMode) {
        ColorBlindMode.DEUTERANOPIA -> DeuteranopiaAccent
        ColorBlindMode.PROTANOPIA -> ProtanopiaAccent
        ColorBlindMode.TRITANOPIA -> TritanopiaAccent
        ColorBlindMode.NONE -> colorScheme.primary
    }

    val gameColors = PuzzleGameColors(
        plateDefault = colorScheme.primaryContainer,
        plateFallen = ScrewRemoved,
        screwActive = ScrewMetal,
        screwBlocked = Color(0xFFEF5350),
        screwRemoved = ScrewRemoved,
        boardBackground = colorScheme.surface
    )

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.setDecorFitsSystemWindows(window, false)
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = resolvedTheme == AppTheme.LIGHT
            }
        }
    }

    CompositionLocalProvider(LocalPuzzleGameColors provides gameColors) {
        MaterialTheme(
            colorScheme = colorScheme.copy(primary = accent),
            typography = PuzzleTypography,
            content = content
        )
    }
}
