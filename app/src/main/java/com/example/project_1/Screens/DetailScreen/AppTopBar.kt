package com.example.project_1.DetailScreen


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
import com.example.project_1.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AppTopBar() {

    TopAppBar(

        title = {

            Text(
                text = "Details",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 90.dp)
            )

        },

        //heart icon
        actions = {
            IconButton(
                onClick = {},
                modifier = Modifier.padding(end = 7.dp)
            ) {

                Icon(
                    painter = painterResource(R.drawable.regular_outline_heart),
                    contentDescription = "heart icon",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(59.dp,59.dp)
                )

            }
        },


        // left arrow
        navigationIcon = {

            IconButton(
                onClick = {},
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