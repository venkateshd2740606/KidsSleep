package com.kidssleep.engine

import com.kidssleep.domain.model.LearningLanguage
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class SleepStoryBankTest {

    @Test
    fun allStories_haveTamilKannadaMalayalamTranslations() {
        SleepStoryBank.all.forEach { story ->
            assertFalse("Story ${story.id} missing tamilTitle", story.tamilTitle.isNullOrBlank())
            assertFalse("Story ${story.id} missing kannadaTitle", story.kannadaTitle.isNullOrBlank())
            assertFalse("Story ${story.id} missing malayalamTitle", story.malayalamTitle.isNullOrBlank())
            assertFalse("Story ${story.id} missing tamilLines", story.tamilLines.isNullOrEmpty())
            assertFalse("Story ${story.id} missing kannadaLines", story.kannadaLines.isNullOrEmpty())
            assertFalse("Story ${story.id} missing malayalamLines", story.malayalamLines.isNullOrEmpty())
        }
    }

    @Test
    fun titleFor_returnsLocalizedTamilKannadaMalayalam() {
        val story = SleepStoryBank.all.first()
        assertNotEquals(story.title, story.titleFor(LearningLanguage.TAMIL))
        assertNotEquals(story.title, story.titleFor(LearningLanguage.KANNADA))
        assertNotEquals(story.title, story.titleFor(LearningLanguage.MALAYALAM))
    }

    @Test
    fun linesFor_returnsLocalizedTamilKannadaMalayalam() {
        val story = SleepStoryBank.all.first()
        assertTrue(story.linesFor(LearningLanguage.TAMIL).isNotEmpty())
        assertTrue(story.linesFor(LearningLanguage.KANNADA).isNotEmpty())
        assertTrue(story.linesFor(LearningLanguage.MALAYALAM).isNotEmpty())
        assertEquals(story.tamilLines, story.linesFor(LearningLanguage.TAMIL))
        assertEquals(story.kannadaLines, story.linesFor(LearningLanguage.KANNADA))
        assertEquals(story.malayalamLines, story.linesFor(LearningLanguage.MALAYALAM))
    }

    @Test
    fun titleFor_fallsBackToEnglishWhenMissing() {
        val story = SleepStoryBank.all.first().copy(tamilTitle = null, kannadaTitle = null, malayalamTitle = null)
        assertEquals(story.title, story.titleFor(LearningLanguage.TAMIL))
        assertEquals(story.title, story.titleFor(LearningLanguage.KANNADA))
        assertEquals(story.title, story.titleFor(LearningLanguage.MALAYALAM))
    }

    @Test
    fun linesFor_fallsBackToEnglishWhenMissing() {
        val story = SleepStoryBank.all.first().copy(tamilLines = null, kannadaLines = null, malayalamLines = null)
        assertEquals(story.lines, story.linesFor(LearningLanguage.TAMIL))
        assertEquals(story.lines, story.linesFor(LearningLanguage.KANNADA))
        assertEquals(story.lines, story.linesFor(LearningLanguage.MALAYALAM))
    }
}
