package com.veux.journee.ui

import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.veux.navigation.graph.RootNavGraph
import com.veux.navigation.Screen

@Composable
fun MainApp() {
    val navController = rememberNavController()

    RootNavGraph(
        navController = navController,
        modifier = Modifier.safeContentPadding(),
        startDestination = Screen.Splash
    )
}