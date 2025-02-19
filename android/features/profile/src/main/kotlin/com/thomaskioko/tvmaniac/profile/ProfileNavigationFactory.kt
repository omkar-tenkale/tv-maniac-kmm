package com.thomaskioko.tvmaniac.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.thomaskioko.tvmaniac.navigation.ComposeNavigationFactory
import com.thomaskioko.tvmaniac.navigation.NavigationScreen
import com.thomaskioko.tvmaniac.navigation.viewModelComposable
import javax.inject.Inject

class ProfileNavigationFactory @Inject constructor() : ComposeNavigationFactory{
    override fun create(builder: NavGraphBuilder, navController: NavHostController) {
        builder.viewModelComposable<ProfileViewModel>(
            route = NavigationScreen.ProfileNavScreen.route,
            content = {
                ProfileScreen(
                    viewModel = this,
                    settingsClicked = {
                        navController.navigate(NavigationScreen.SettingsScreen.route)
                    }
                )
            }
        )
    }
}
