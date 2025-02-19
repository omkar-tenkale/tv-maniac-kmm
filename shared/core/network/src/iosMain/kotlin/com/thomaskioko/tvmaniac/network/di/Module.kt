package com.thomaskioko.tvmaniac.network.di

import com.thomaskioko.tvmaniac.network.KtorClientFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun networkPlatformModule(): Module = module {
    single { KtorClientFactory().httpClient(get()) }
}
