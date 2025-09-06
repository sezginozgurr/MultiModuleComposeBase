package com.app.multimodulecomposebase.di

import com.app.multimodulecomposebase.data.repository.MainRepositoryImpl
import com.app.multimodulecomposebase.domain.repository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMainRepository(repositoryImpl: MainRepositoryImpl): MainRepository
}