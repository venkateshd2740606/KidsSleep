package com.kidssleep.di

import android.content.Context
import androidx.room.Room
import com.kidssleep.data.local.database.KidsSleepDatabase
import com.kidssleep.data.local.database.dao.AchievementDao
import com.kidssleep.data.local.database.dao.ChallengeDao
import com.kidssleep.data.local.database.dao.EconomyDao
import com.kidssleep.data.local.database.dao.GameDao
import com.kidssleep.data.local.database.dao.ProfileDao
import com.kidssleep.data.local.database.dao.StatsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): KidsSleepDatabase =
        Room.databaseBuilder(context, KidsSleepDatabase::class.java, "kidssleep.db")
            .fallbackToDestructiveMigration()
            .build()

    @Provides fun provideGameDao(db: KidsSleepDatabase): GameDao = db.gameDao()
    @Provides fun provideStatsDao(db: KidsSleepDatabase): StatsDao = db.statsDao()
    @Provides fun provideAchievementDao(db: KidsSleepDatabase): AchievementDao = db.achievementDao()
    @Provides fun provideChallengeDao(db: KidsSleepDatabase): ChallengeDao = db.challengeDao()
    @Provides fun provideEconomyDao(db: KidsSleepDatabase): EconomyDao = db.economyDao()
    @Provides fun provideProfileDao(db: KidsSleepDatabase): ProfileDao = db.profileDao()
}
