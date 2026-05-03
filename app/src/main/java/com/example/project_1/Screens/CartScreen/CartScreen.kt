package com.example.project_1.Screens.CartScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.project_1.R
import com.example.project_1.Screens.DetailScreen.AppBottomBar
import com.example.project_1.Screens.Ui_Components.MyBottomNavigationBar
import com.example.project_1.model.Product

@Composable
fun CartScreen(navController: NavHostController) {

    val LightBrown = Color(0xFFC67C4E)

    val Cartproducts = listOf(

        Product(id = 1, name = "Espresso", description = "Strong and rich", price = 3.80, imageRes = R.drawable.coffee_2),
        Product(id = 2, name = "Latte", description = "Smooth and creamy", price = 4.50, imageRes = R.drawable.coffee_3),
        Product(id = 3, name = "Cappuccino", description = "With chocolate", price = 4.20, imageRes = R.drawable.coffee_1)

    )

    var amount by remember{ mutableStateOf(12.50) }
    var deliveryFee by remember{ mutableStateOf(1.0) }

    Scaffold (
        topBar  = { CartScreenTopAppBar(navController) },
        bottomBar = { MyBottomNavigationBar(navController, "Cart") }
    )
    { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(12.dp)
                .padding(innerPadding)
        ) {

            item {

                Row() {

                    Text(
                        text = "Deliver",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightBrown,
                        //modifier = Modifier.padding(start = 14.dp)
                    )

                }

                Spacer(modifier = Modifier.height(8.dp))

                Cartproducts.forEach { product ->
                    CartItemCard(product)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(text = "price", fontSize = 19.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "$${amount}", fontWeight = FontWeight.SemiBold)

                }

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(text = "Delivery Fee", fontSize = 19.sp, fontWeight = FontWeight.SemiBold)
                    Text(text = "$${deliveryFee}", fontWeight = FontWeight.SemiBold)

                }

                Spacer(modifier = Modifier.height(15.dp))

                PaymentMode()

            }
        }
    }

}

