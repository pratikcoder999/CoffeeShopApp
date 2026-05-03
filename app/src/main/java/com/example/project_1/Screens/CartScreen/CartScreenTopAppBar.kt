package com.example.project_1.Screens.CartScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project_1.Navigation.Routes
import com.example.project_1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartScreenTopAppBar(navController: NavController) {

    TopAppBar(

        title = {

            Text(
                text = "Orders",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 90.dp)
            )

        },


        // left arrow
        navigationIcon = {

            IconButton(
                onClick = { navController.navigate(route = Routes.HomeScreen) },
            ) {

                Icon(
                    painter = painterResource(R.drawable.regular_outline_arrow_left),
                    contentDescription = "left arrow",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(49.dp,49.dp)
                )

            }
        }


    )

}