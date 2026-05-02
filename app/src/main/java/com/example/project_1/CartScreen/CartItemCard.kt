package com.example.project_1.CartScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1.R

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun CartItemCard() {

    val LightBrown = Color(0xFFC67C4E)

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors (
                containerColor = MaterialTheme.colorScheme.surface
                )
    ) {

        Row(modifier = Modifier.fillMaxWidth().padding(12.dp)) {

            Image(
                painter = painterResource (id = R.drawable.coffee_3),
                contentDescription = "Coffee Image",
                modifier = Modifier
                    .size(size = 80.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )

            Column(
                modifier = Modifier.weight(1f).padding(start = 12.dp)
            ) {

                Text(
                    text = "Coffee Name",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )

                Text(
                    text = "Coffee Description",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.DarkGray
                    )
                )

            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(
                    onClick = {},
                    modifier = Modifier.background(
                        color = LightBrown,
                        shape = CircleShape,
                    )
                    .size(30.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Increase",
                        tint = Color.White
                    )
                }

                Text(text = "1")

                IconButton(
                    onClick = {},
                    modifier = Modifier.background(
                        color = LightBrown,
                        shape = CircleShape,
                    )
                        .size(30.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Remove,
                        contentDescription = "Decrease",
                        tint = Color.White
                    )
                }

            }


        }
    }
}
