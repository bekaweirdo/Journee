package com.veux.navigation.ext

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.veux.navigation.Screen

fun NavController.navigateTo(
    screen: Screen
) {

    val currentRoute: String? = this.currentBackStackEntry?.destination?.route

    val route = screen.routePath?.let { routePath ->
        screen.route.replaceAfter("/", routePath)
    } ?: screen.route

    Log.d("navigation", "navigateTo: ${screen.route}")

    navigate(route) {

        Log.d("navigation", "findStartDestination: ${graph.findStartDestination()}")

        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        // Avoid multiple copies of the same destination when
        // reselecting the same item
        launchSingleTop = true
        // Restore state when reselecting a previously selected item
        restoreState = screen.restoreState

        //Clearing back stack up to certain screen if required
        if (screen.clearBackStack && !currentRoute.isNullOrEmpty())
            popUpTo(currentRoute) {
                inclusive = true
            }
    }
}