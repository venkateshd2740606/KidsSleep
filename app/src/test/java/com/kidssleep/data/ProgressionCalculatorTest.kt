package com.kidssleep.data

import com.kidssleep.domain.model.Difficulty
import com.kidssleep.domain.model.GameStatus
import com.kidssleep.engine.KidsSleepEngine
import com.kidssleep.engine.KidsSleepGenerator
import com.kidssleep.util.ProgressionCalculator
import org.junit.Assert.assertTrue
import org.junit.Test

class ProgressionCalculatorTest {

    @Test
    fun xpForCompletedGame_isPositive() {
        val level = KidsSleepGenerator.generate(1L, 1, Difficulty.EASY)
        val game = KidsSleepEngine.createInitialGame(level).copy(status = GameStatus.COMPLETED)
        assertTrue(ProgressionCalculator.xpForGame(game) > 0)
    }

    @Test
    fun xpForGame_withHints_isLowerThanWithoutHints() {
        val level = KidsSleepGenerator.generate(1L, 1, Difficulty.EASY)
        val withHints = KidsSleepEngine.createInitialGame(level).copy(hintsUsed = 2, status = GameStatus.COMPLETED)
        val noHints = KidsSleepEngine.createInitialGame(level).copy(hintsUsed = 0, status = GameStatus.COMPLETED)
        assertTrue(ProgressionCalculator.xpForGame(noHints) >= ProgressionCalculator.xpForGame(withHints))
    }
}
