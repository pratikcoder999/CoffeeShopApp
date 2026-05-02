package com.example.project_1.Screens.HomeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project_1.Navigation.Routes
import com.example.project_1.R
import com.example.project_1.model.Product


@Composable
fun ProductCard(
    product: Product,
    modifier: Modifier = Modifier,
    navController: NavController
) {

    val lightBrown = Color(0xFFC67C4E)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 7.dp
        )
    ){
        Column(modifier = Modifier.padding(9.dp)) {

            //Product image
            Box(
                modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
            ) {

                Image(
                    painter = painterResource(product.imageRes),
                    contentDescription = "coffee image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(24.dp))
                )

                // heart icon
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .background(
                            color = LightGray.copy(alpha = 0.3f),
                            shape = RoundedCornerShape(10.dp)
                        )
                ){
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "heart icon",
                        tint = lightBrown,
                        modifier = Modifier
                            .size(30.dp)
                    )
                }

            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = product.name,
                style = typography.titleLarge,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text =  product.description,
                style = typography.bodyMedium,
                color = Color.DarkGray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "$${product.price}",
                    fontSize = 20.sp,
                    style = typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = lightBrown
                    )
                )

                IconButton(
                    onClick = { navController.navigate(Routes.DetailScreen(product.id)) },
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = lightBrown,
                        contentColor = Color.White,
                    ),
                    modifier = Modifier.background(
                        color = lightBrown,
                        shape = RoundedCornerShape(12.dp)
                    )
                        .size(55.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "add to cart",
                    )

                }

            }

        }
    }

}