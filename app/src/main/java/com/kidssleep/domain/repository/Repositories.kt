package com.kidssleep.domain.repository

import com.kidssleep.domain.model.Achievement
import com.kidssleep.domain.model.ChallengeRecord
import com.kidssleep.domain.model.ChallengeType
import com.kidssleep.domain.model.KidsSleepGame
import com.kidssleep.domain.model.KidsSleepLevel
import com.kidssleep.domain.model.Difficulty
import com.kidssleep.domain.model.EconomyState
import com.kidssleep.domain.model.PuzzleProfile
import com.kidssleep.domain.model.UserStats
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    suspend fun createNewGame(difficulty: Difficulty, levelNumber: Int): KidsSleepGame
    suspend fun createGameFromSeed(seed: Long, levelNumber: Int, difficulty: Difficulty): KidsSleepGame
    suspend fun createTutorialGame(tutorialIndex: Int): KidsSleepGame?
    suspend fun createEndlessGame(wave: Int): KidsSleepGame
    suspend fun saveGame(game: KidsSleepGame): Long
    suspend fun getGame(gameId: Long): KidsSleepGame?
    suspend fun getInProgressGame(): KidsSleepGame?
    fun observeInProgressGame(): Flow<KidsSleepGame?>
    suspend fun completeGame(game: KidsSleepGame): KidsSleepGame
    suspend fun abandonGame(gameId: Long)
    suspend fun getLevel(seed: Long, levelNumber: Int, difficulty: Difficulty): KidsSleepLevel
}

interface ChallengeRepository {
    suspend fun getChallenge(type: ChallengeType, key: String): ChallengeRecord?
    suspend fun createChallenge(type: ChallengeType, key: String, difficulty: Difficulty): ChallengeRecord
    suspend fun resolveActiveChallenge(type: ChallengeType): ChallengeRecord
    fun observeActiveChallenge(type: ChallengeType): Flow<ChallengeRecord?>
    suspend fun completeChallenge(record: ChallengeRecord, timeSeconds: Long, moves: Int): ChallengeRecord
    fun observeChallengeHistory(type: ChallengeType): Flow<List<ChallengeRecord>>
    suspend fun getCurrentStreak(type: ChallengeType): Int
    suspend fun getChallengeGame(record: ChallengeRecord): KidsSleepGame
}

interface ProgressionRepository {
    fun observeStats(): Flow<UserStats>
    suspend fun getStats(): UserStats
    suspend fun updateStatsAfterGame(game: KidsSleepGame)
    suspend fun grantChallengeRewards(rewardCoins: Int, rewardXp: Int)
    fun observePuzzleProfile(): Flow<PuzzleProfile>
    suspend fun getPuzzleProfile(): PuzzleProfile
    fun observeAchievements(): Flow<List<Achievement>>
    suspend fun checkAndUnlockAchievements(
        game: KidsSleepGame,
        sameDevicePlayed: Boolean = false
    ): List<Achievement>
    fun observeEconomy(): Flow<EconomyState>
    suspend fun getEconomy(): EconomyState
    suspend fun spendCoins(amount: Int): Boolean
    suspend fun earnCoins(amount: Int)
    suspend fun unlockTheme(themeId: String): Boolean
}

interface PreferencesRepository {
    fun getUserPreferences(): Flow<com.kidssleep.domain.model.UserPreferences>
    suspend fun updatePreferences(transform: (com.kidssleep.domain.model.UserPreferences) -> com.kidssleep.domain.model.UserPreferences)
    suspend fun getCampaignLevel(difficulty: Difficulty): Int
    suspend fun advanceCampaignLevel(difficulty: Difficulty): Int
}
