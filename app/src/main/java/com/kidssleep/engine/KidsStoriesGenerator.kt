package com.kidssleep.engine

import com.kidssleep.domain.model.Difficulty
import com.kidssleep.domain.model.GenerationProfile
import com.kidssleep.domain.model.KidsSleepLevel
import com.kidssleep.domain.model.Story

object KidsSleepGenerator {

    fun generate(
        seed: Long,
        levelNumber: Int,
        difficulty: Difficulty,
        generationProfile: GenerationProfile = GenerationProfile()
    ): KidsSleepLevel {
        val story = selectStoryForLevel(levelNumber, generationProfile)
        return KidsSleepLevel(
            seed = seed,
            levelNumber = levelNumber,
            difficulty = difficulty,
            stories = listOf(story),
            isEndless = difficulty == Difficulty.ENDLESS
        )
    }

    fun generateForChallenge(
        seed: Long,
        levelNumber: Int,
        difficulty: Difficulty
    ): KidsSleepLevel = generate(seed, levelNumber, difficulty)

    fun seedFromLevelNumber(levelNumber: Int, difficulty: Difficulty): Long {
        val difficultyOffset = difficulty.ordinal * 100_000L
        return levelNumber.toLong() * 9973L + difficultyOffset + 42L
    }

    fun formatShareText(seed: Long, levelNumber: Int, difficulty: Difficulty): String =
        "Kids Stories\nSeed: $seed\nLevel: $levelNumber\nDifficulty: ${difficulty.name}"

    fun selectStoryForLevel(
        levelNumber: Int,
        profile: GenerationProfile = GenerationProfile()
    ): Story {
        val bank = SleepStoryBank.all
        val offset = profile.storySpreadModifier.coerceIn(-1, 2)
        val index = ((levelNumber - 1 + offset).coerceAtLeast(0)) % bank.size
        return bank[index]
    }
}
