package com.example.project_1.Screens.HomeScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1.Screens.Ui_Components.CategoryChip

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenCategories() {

    //category of coffee shown using clickable card composable,
    // it is named as categoryCard and is created inside
    // ui_component package and had been implemented here.(search under ui_component to change the card structure)

    val categories = listOf(
        "All coffees",
        "Macchiato",
        "Espresso",
        "Cappuccino",
        "Americano",
        "Snacks",
        "Deserts"
    )

    var selectedCategory by remember { mutableStateOf(categories.first()) }

    LazyRow(

        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        items(categories) { category ->


            /* CategoryCard composable/function declared inside ui_component
         had been called with values inside the categories list
         made just above the lazy row  */

            CategoryChip(
                text = category,
                isSelected = category == selectedCategory,
                onSelected = { selectedCategory = category }
            )
        }
    }

}
