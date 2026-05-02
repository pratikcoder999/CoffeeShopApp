package com.example.project_1.Screens.DetailScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.Screens.Ui_Components.AppMessageDialog

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppBottomBar() {

    var showCartDialog by remember { mutableStateOf(false) }

    BottomAppBar(
        contentColor = Color.Transparent
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 18.dp)
        ) {
            Column() {

                Text(
                    text = "Price",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "$4.50",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )

            }

            Spacer(modifier = Modifier.width(40.dp))

            Button(
                onClick = { showCartDialog = true},
                modifier = Modifier
                    .weight(1f)
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors =  ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFC67C4E),
                    contentColor = Color.White
                )
            ) {

                Text(
                    text = "Add to Cart",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )

            }

            AppMessageDialog(
                show = showCartDialog,
                title = "Success",
                message = "Item added to cart",
                onDismiss = { showCartDialog = false }
            )
        }
    }
}