package com.kidssleep.engine

import com.kidssleep.domain.model.Difficulty
import com.kidssleep.domain.model.KidsSleepLevel

object TutorialLevels {

    val all: List<KidsSleepLevel> = listOf(
        level1Twinkle(),
        level2BaaBaa(),
        level3JackAndJill(),
        level4HumptyDumpty(),
        level5RowYourBoat()
    )

    fun getTutorialLevel(index: Int): KidsSleepLevel? = all.getOrNull(index)

    private fun level1Twinkle(): KidsSleepLevel = KidsSleepLevel(
        seed = 1,
        levelNumber = 1,
        difficulty = Difficulty.BEGINNER,
        isTutorial = true,
        stories = listOf(SleepStoryBank.byId(1)!!)
    )

    private fun level2BaaBaa(): KidsSleepLevel = KidsSleepLevel(
        seed = 2,
        levelNumber = 2,
        difficulty = Difficulty.BEGINNER,
        isTutorial = true,
        stories = listOf(SleepStoryBank.byId(2)!!)
    )

    private fun level3JackAndJill(): KidsSleepLevel = KidsSleepLevel(
        seed = 3,
        levelNumber = 3,
        difficulty = Difficulty.EASY,
        isTutorial = true,
        stories = listOf(SleepStoryBank.byId(3)!!)
    )

    private fun level4HumptyDumpty(): KidsSleepLevel = KidsSleepLevel(
        seed = 4,
        levelNumber = 4,
        difficulty = Difficulty.EASY,
        isTutorial = true,
        stories = listOf(SleepStoryBank.byId(4)!!)
    )

    private fun level5RowYourBoat(): KidsSleepLevel = KidsSleepLevel(
        seed = 5,
        levelNumber = 5,
        difficulty = Difficulty.MEDIUM,
        isTutorial = true,
        stories = listOf(SleepStoryBank.byId(5)!!)
    )
}
