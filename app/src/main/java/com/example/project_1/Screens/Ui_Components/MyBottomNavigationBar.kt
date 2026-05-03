package com.example.project_1.Screens.Ui_Components

import android.net.http.SslCertificate.saveState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project_1.Navigation.Routes
import com.example.project_1.R


@Composable
fun MyBottomNavigationBar( navController: NavController, route: String  ) {

    val CoffeeBrown = Color(0xFFC47B4D)

    val navItems = listOf(
            NavItems("Home", R.drawable.regular_outline_home, Routes.HomeScreen),
            NavItems("Cart", R.drawable.regular_outline_bag, Routes.CartScreen),
            NavItems("Favourites", R.drawable.regular_outline_heart, Routes.FavouritesScreen),
            NavItems("Profile", R.drawable.outline_account_circle_24, Routes.ProfileScreen)
        )


    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(130.dp)
    ) {

        navItems.forEach { item ->

            NavigationBarItem(
                icon = {
                    Icon(
                    painter = painterResource( item.icon),
                    contentDescription = item.title,
                        //tint = if (item.title == route) CoffeeBrown else Color.White,
                        //modifier = Modifier.background()
                    )
                },
                label = { Text(text = item.title) },
                modifier = Modifier.size(50.dp),

                // handling navigation
                onClick = {
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                selected = item.title == route,
                alwaysShowLabel = true,

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = CoffeeBrown,
                    selectedTextColor = CoffeeBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = CoffeeBrown.copy(alpha = 0.03f)
                )
            )
        }

    }
}

data class NavItems (
    val title: String,
    val icon: Int,
    val route: Routes
)