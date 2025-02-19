package com.thomaskioko.tvmaniac.core.util.di

import com.thomaskioko.tvmaniac.core.util.helper.DateUtilHelper
import com.thomaskioko.tvmaniac.core.util.helper.DateUtilHelperImpl
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun coreUtilModule(): Module = module {

    single<DateUtilHelper> { DateUtilHelperImpl() }
}
