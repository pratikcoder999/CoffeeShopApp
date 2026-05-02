package com.example.project_1.Screens.HomeScreen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.project_1.R
import com.example.project_1.Screens.Ui_Components.MyBottomNavigationBar
import com.example.project_1.model.Product


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {

    val CoffeeBrown = Color(0xFFC47B4D)

    Scaffold(
        bottomBar = { MyBottomNavigationBar() }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(color = Color.Black)
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .padding(innerPadding)
        ) {

            // Displaying Products
            val products = listOf(

                Product(id = 1,  "Espresso", "Strong and rich", 3.80, R.drawable.coffee_2),
                Product(id = 2,  "Latte", "Smooth and creamy", 4.50, R.drawable.coffee_3),
                Product(id = 3,  "Cappuccino", "With Chocolate", 4.80, R.drawable.coffee_1),
                Product(id = 4,  "Mocha", "Cocoa flavored", 2.80, R.drawable.coffee_4),
                Product(id = 5,  "Macchiato", "Bold and milky", 5.80, R.drawable.coffee_5),
                Product(id = 6,  "Flat White", "Velvety smooth", 3.80, R.drawable.coffee_6),
                Product(id = 7,  "Iced Mocha", "Refreshing and rich", 5.70, R.drawable.coffee_4),

            )

            ProductsGrid(products = products, navController = navController){
                Text(
                    text = "Location",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Row() {
                    Text(
                        text = "1/1 Thackery Road, Alipore",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "arrow down",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                //Search Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    var searchText by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = searchText,
                        onValueChange = { searchText = it },
                        modifier = Modifier.weight(1f),
                        singleLine = true,
                        shape = RoundedCornerShape(topStart = 13.dp, bottomStart = 13.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            unfocusedContainerColor = Color(0xFF2A2A2A),
                            focusedContainerColor = Color(0xFF422A24)
                        ),
                        placeholder = {
                            Text(
                                text = "Search Coffee",
                                color = Color.Gray,
                                fontSize = 16.sp
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "search icon",
                                tint = Color.White
                            )
                        },
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .size(58.dp)
                            .background(
                                color = CoffeeBrown, shape = RoundedCornerShape(
                                    topStart = 0.dp,
                                    topEnd = 16.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 16.dp
                                )
                            )
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.regular_outline_filter),
                            contentDescription = "filter icon",
                            tint = Color.White
                        )

                    }
                }

                Spacer(modifier = Modifier.height(23.dp))

                // Promo Banner
                Image(
                    painter = painterResource(R.drawable.banner_1),
                    contentDescription = "banner"
                )


                Spacer(modifier = Modifier.height(7.dp))

                HomeScreenCategories() //file under Homescreen package contains category list of coffees.

            }

        }
    }
}
