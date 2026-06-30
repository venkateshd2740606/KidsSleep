package com.kidssleep.engine

import com.kidssleep.domain.model.Difficulty
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class KidsSleepEngineTest {

    @Test
    fun tutorialLevel_isValid() {
        val level = TutorialLevels.getTutorialLevel(0)!!
        assertTrue(KidsSleepEngine.validateLevel(level))
    }

    @Test
    fun nextLine_advancesThroughStory() {
        val level = TutorialLevels.getTutorialLevel(0)!!
        var game = KidsSleepEngine.createInitialGame(level)
        assertEquals(0, game.currentLineIndex)
        game = KidsSleepEngine.nextLine(game)
        assertEquals(1, game.currentLineIndex)
        assertEquals(1, game.moves)
    }

    @Test
    fun nextLine_onLastLine_completesGame() {
        val level = TutorialLevels.getTutorialLevel(0)!!
        var game = KidsSleepEngine.createInitialGame(level)
        val lineCount = level.stories.first().lines.size
        repeat(lineCount) {
            game = KidsSleepEngine.nextLine(game)
        }
        assertTrue(KidsSleepEngine.isWon(game))
        assertTrue(game.isCompleted)
        assertEquals(lineCount, game.moves)
    }

    @Test
    fun generatedLevel_isValid() {
        val level = KidsSleepGenerator.generate(12345L, 1, Difficulty.EASY)
        assertTrue(KidsSleepEngine.validateLevel(level))
        assertEquals(1, level.stories.size)
    }

    @Test
    fun generator_sameSeed_producesSameStory() {
        val a = KidsSleepGenerator.generate(999L, 5, Difficulty.MEDIUM)
        val b = KidsSleepGenerator.generate(999L, 5, Difficulty.MEDIUM)
        assertEquals(a.stories.first().id, b.stories.first().id)
    }

    @Test
    fun generator_cyclesStoriesByLevelNumber() {
        val level1 = KidsSleepGenerator.generate(1L, 1, Difficulty.EASY)
        val level16 = KidsSleepGenerator.generate(2L, 16, Difficulty.EASY)
        assertEquals(level1.stories.first().id, level16.stories.first().id)
    }

    @Test
    fun applyHint_advancesLine() {
        val level = KidsSleepGenerator.generate(42L, 1, Difficulty.EASY)
        val game = KidsSleepEngine.createInitialGame(level)
        assertTrue(KidsSleepEngine.canApplyHint(game))
        val updated = KidsSleepEngine.applyHint(game)
        assertEquals(1, updated.hintsUsed)
        assertEquals(1, updated.currentLineIndex)
    }

    @Test
    fun p2pMoveFormat_roundTrips() {
        val payload = KidsSleepEngine.formatP2PMove(2, 3)
        assertEquals("line:2:3", payload)
        val parsed = KidsSleepEngine.parseP2PMove(payload)
        assertNotNull(parsed)
        assertEquals(2, parsed!!.first)
        assertEquals(3, parsed.second)
    }

    @Test
    fun storyBank_has15Stories() {
        assertEquals(12, SleepStoryBank.all.size)
    }

    @Test
    fun prevLine_goesBack() {
        val level = TutorialLevels.getTutorialLevel(0)!!
        var game = KidsSleepEngine.createInitialGame(level)
        game = KidsSleepEngine.nextLine(game)
        game = KidsSleepEngine.prevLine(game)
        assertEquals(0, game.currentLineIndex)
    }

    @Test
    fun optimalMoveCount_equalsLineCount() {
        val level = TutorialLevels.getTutorialLevel(0)!!
        val game = KidsSleepEngine.createInitialGame(level)
        assertEquals(level.totalLines, KidsSleepEngine.optimalMoveCount(game))
    }
}
