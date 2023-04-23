package com.veux.navigation

sealed class Screen(
    val route: String,
    var routePath: String? = null,
    var clearBackStack: Boolean = false,
    val restoreState: Boolean = true,
    val title: String? = null,
) {
    object Splash: Screen(route = navigateToSplash)

    companion object {
        const val navigateToSplash = "splash"
    }
}