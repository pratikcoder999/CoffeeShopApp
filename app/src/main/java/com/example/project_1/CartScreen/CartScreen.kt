package com.example.project_1.CartScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.project_1.R
import com.example.project_1.model.Product

@Preview
@Composable
fun CartScreen() {

    val products = listOf(

        Product(id = 1, name = "Espresso", description = "Strong and rich", price = 3.80, imageRes = R.drawable.coffee_2),
        Product(id = 2, name = "Latte", description = "Smooth and creamy", price = 4.50, imageRes = R.drawable.coffee_3),
        Product(id = 3, name = "Cappuccino", description = "With chocolate", price = 4.20, imageRes = R.drawable.coffee_1)

    )
    Scaffold (
        topBar  = { CartScreenTopAppBar() }
    )
    { innerPadding ->
        CartItemCard(innerPadding)
    }

}

