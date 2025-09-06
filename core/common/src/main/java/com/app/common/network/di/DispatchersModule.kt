package com.app.common.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
object DispatchersModule {
    @Provides
    @com.app.common.network.qualifier.Dispatchers.IO
    fun provideIODispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @com.app.common.network.qualifier.Dispatchers.Main
    fun provideMainDispatcher(): CoroutineDispatcher = Dispatchers.Main

    @Provides
    @com.app.common.network.qualifier.Dispatchers.Default
    fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @Provides
    @com.app.common.network.qualifier.Dispatchers.Unconfined
    fun provideUnconfinedDispatcher(): CoroutineDispatcher = Dispatchers.Unconfined
}
