package com.example.project_1.Screens.FavouritesScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.project_1.R
import com.example.project_1.Screens.Ui_Components.MyBottomNavigationBar
import com.example.project_1.model.Product


@Composable
fun FavouritesScreen(navController: NavController) {
    var favouriteItems by remember {
        mutableStateOf(
            value = listOf(
                Product(
                    id = 1,
                    name = "Espresso",
                    description = "Strong and rich",
                    price = 3.80,
                    R.drawable.coffee_2
                ),
                Product(
                    id = 2,
                    name = "Latte",
                    description = "Smooth and creamy",
                    price = 4.50,
                    R.drawable.coffee_3
                ),
                Product(
                    id = 3,
                    name = "Cappuccino",
                    description = "With chocolate",
                    price = 4.20,
                    R.drawable.coffee_1
                )
            )
        )
    }

    Scaffold(
        topBar = { FavouritesScreenTopBar() },
        bottomBar = { MyBottomNavigationBar(navController = navController, "Favourites") }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ) {

            item {
                favouriteItems.forEach { product ->
                    FavouriteItemCard(
                        product,
                        onRemove = { favouriteItems = favouriteItems - product }
                    )
                }

            }
        }
    }
}