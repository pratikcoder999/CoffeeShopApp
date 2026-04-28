package com.example.project_1.Screens.Ui_Components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomNavigationBar() {

    val CoffeeBrown = Color(0xFFC47B4D)

    val navItems = listOf(
            NavItems("Home", R.drawable.regular_outline_home),
            NavItems("Cart", R.drawable.regular_outline_bag),
            NavItems("Favourites", R.drawable.regular_outline_heart),
            NavItems("Profile", R.drawable.outline_account_circle_24)
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
                    contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                modifier = Modifier.size(50.dp),
                onClick = {  },

                selected = false,
                alwaysShowLabel = true,

                colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Gray,
                unselectedIconColor = CoffeeBrown
                )
            )
        }

    }


}

data class NavItems (
    val title: String,
    val icon: Int,
//    val route: String
)