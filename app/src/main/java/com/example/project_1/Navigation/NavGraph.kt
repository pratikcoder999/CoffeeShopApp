package com.example.project_1.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.project_1.Screens.HomeScreen.HomeScreen
import com.example.project_1.Screens.WelcomeScreen.WelcomeScreen
import com.example.project_1.Screens.DetailScreen.DetailScreen

@Preview
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

        composable<Routes.DetailScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailScreen>()
            DetailScreen(productId = args.productId, navController = navController)
        }
    }
}