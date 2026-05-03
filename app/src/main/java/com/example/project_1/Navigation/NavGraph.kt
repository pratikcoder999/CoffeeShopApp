package com.example.project_1.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.project_1.Screens.CartScreen.CartScreen
import com.example.project_1.Screens.HomeScreen.HomeScreen
import com.example.project_1.Screens.WelcomeScreen.WelcomeScreen
import com.example.project_1.Screens.DetailScreen.DetailScreen
import com.example.project_1.Screens.FavouritesScreen.FavouritesScreen
import com.example.project_1.Screens.ProfileScreen.ProfileScreen


@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.WelcomeScreen
    ) {
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.CartScreen> {
            CartScreen(navController)
        }

        composable<Routes.FavouritesScreen> {
            FavouritesScreen(navController)
        }

        composable<Routes.FavouritesScreen> {
            ProfileScreen(navController)
        }

        composable<Routes.DetailScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailScreen>()
            DetailScreen(productId = args.productId, navController = navController)
        }

    }
}