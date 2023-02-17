package com.veux.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.veux.navigation.Screen
import com.veux.splash.view.SplashScreen

fun NavGraphBuilder.navigateToSplash(onNavigateToRoot: (Screen) -> Unit){
    composable(
        route = Screen.Splash.route
    ){
        SplashScreen()
    }
}