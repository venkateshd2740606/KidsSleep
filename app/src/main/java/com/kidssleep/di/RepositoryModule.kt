package com.kidssleep.di

import com.kidssleep.data.repository.ChallengeRepositoryImpl
import com.kidssleep.data.repository.GameRepositoryImpl
import com.kidssleep.data.repository.PreferencesRepositoryImpl
import com.kidssleep.data.repository.ProgressionRepositoryImpl
import com.kidssleep.domain.repository.ChallengeRepository
import com.kidssleep.domain.repository.GameRepository
import com.kidssleep.domain.repository.PreferencesRepository
import com.kidssleep.domain.repository.ProgressionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds @Singleton abstract fun bindGameRepository(impl: GameRepositoryImpl): GameRepository
    @Binds @Singleton abstract fun bindChallengeRepository(impl: ChallengeRepositoryImpl): ChallengeRepository
    @Binds @Singleton abstract fun bindProgressionRepository(impl: ProgressionRepositoryImpl): ProgressionRepository
    @Binds @Singleton abstract fun bindPreferencesRepository(impl: PreferencesRepositoryImpl): PreferencesRepository
}
