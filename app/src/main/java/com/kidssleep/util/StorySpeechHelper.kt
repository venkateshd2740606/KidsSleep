package com.kidssleep.util

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kidssleep.domain.model.LearningLanguage

class StorySpeechHelper(
    private val ttsHelper: StoryTtsHelper
) {
    fun speak(storyId: Int, lineIndex: Int, text: String, language: LearningLanguage) {
        if (text.isBlank()) return
        ttsHelper.speak(text, language)
    }

    fun stop() {
        ttsHelper.stop()
    }

    fun shutdown() {
        ttsHelper.shutdown()
    }
}

@Composable
fun rememberStorySpeech(@Suppress("UNUSED_PARAMETER") useBundledAudio: Boolean = false): StorySpeechHelper {
    val context = LocalContext.current
    val ttsHelper = remember { StoryTtsHelper(context) }
    val helper = remember { StorySpeechHelper(ttsHelper) }
    DisposableEffect(helper) {
        onDispose { helper.shutdown() }
    }
    return helper
}
