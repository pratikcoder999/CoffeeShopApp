package com.example.project_1.Screens.DetailScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.project_1.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.project_1.DetailScreen.AppTopBar
import com.example.project_1.model.Product

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailScreen(productId: Int, navController: NavHostController) {


    val products = listOf(

        Product(id = 2, name = "Latte", description = "Smooth and creamy", price = 4.50, imageRes = R.drawable.coffee_3),
        Product(id = 2, name = "Latte", description = "Smooth and creamy", price = 4.50, imageRes = R.drawable.coffee_3),
        Product(id = 3, name = "Cappuccino", description = "With chocolate", price = 4.20, imageRes = R.drawable.coffee_1),
        Product(id = 4, name = "Mocha", description = "With cocoa flavor", price = 4.70, imageRes = R.drawable.coffee_4),
        Product(id = 5, name = "Macchiato", description = "Bold and milky", price = 4.60, imageRes = R.drawable.coffee_5),
        Product(id = 6, name = "Flat White", description = "Velvety smooth", price = 4.40, imageRes = R.drawable.coffee_6),
        Product(id = 7, name = "Iced Mocha", description = "Refreshing and rich", price = 4.70, imageRes = R.drawable.coffee_4)

    )

    val selectedProduct = products.find { it.id == productId }
    if (selectedProduct == null) {
        Text(text = "Product not found!", modifier = Modifier.padding(26.dp), color = Color.Red)
        return
    }

    Scaffold(
        topBar = { AppTopBar(navController) },
        bottomBar = { AppBottomBar() }
    ) { innerPadding ->

        LazyColumn() {

            item{
                ProductsDetailContent(
                    product = selectedProduct,
                    innerPadding
                )
            }

        }
    }


}