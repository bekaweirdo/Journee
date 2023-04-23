package com.veux.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


fun NavGraphBuilder.splashNavGraph(
    onNavGraphRoot: (Screen) -> Unit
){
    composable(
        route = Screen.Splash.route
    ){
        val navController = rememberNavController()

        SplashScreen()
    }
}