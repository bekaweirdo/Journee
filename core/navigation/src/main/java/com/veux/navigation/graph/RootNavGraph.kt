package com.veux.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.veux.navigation.Screen
import com.veux.navigation.ext.navigateTo

@Composable
fun RootNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: Screen
    ){
    NavHost(
        navController = navController,
        startDestination = startDestination.route,
        modifier = modifier,
        route = NAVIGATION_BASE_URL
    ) {
        navigateToSplash(navController::navigateTo)
    }
}

const val NAVIGATION_BASE_URL = "journee_host_root"