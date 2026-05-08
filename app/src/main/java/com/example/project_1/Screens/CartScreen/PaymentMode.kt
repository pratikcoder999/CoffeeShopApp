package com.example.project_1.Screens.CartScreen

import android.R.attr.onClick
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.Navigation.Routes
import com.example.project_1.R
import com.example.project_1.Screens.Ui_Components.AppMessageDialog
import com.example.project_1.Screens.Ui_Components.CoffeeBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PaymentMode() {

    var amount by remember{ mutableStateOf(12.50) }
    var deliveryFee by remember{ mutableStateOf(1.0) }
    var totalAmount by remember{ mutableStateOf(amount + deliveryFee) }

    val LightBrown = Color(0xFFC67C4E)

    var expand by remember { mutableStateOf(false) }

    var selectedMode by remember { mutableStateOf("UPI") }

    var payments = listOf("UPI", "Debit Card", "Credit Card", "Cash")

    var showOrderDialog by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.mobile_banking),
                    contentDescription = "Payment Mode",
                    modifier = Modifier.size(size = 30.dp),
                    tint = LightBrown
                )

                Spacer(modifier = Modifier.padding(8.dp))

                Column(
                ) {

                    Text(
                        text = "online",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        text = "$${totalAmount.toString()}",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.SemiBold
                        ),
                        color = LightBrown
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {

                    Box() {

                        Icon(
                            painter = painterResource(R.drawable.regular_outline_arrow_down),
                            "payment mode",
                            modifier = Modifier.size(20.dp).clickable { expand = true }
                        )

                        DropdownMenu(
                            expanded = expand,
                            onDismissRequest = { expand = false }
                        ) {

                            payments.forEach { mode ->
                                DropdownMenuItem(
                                    text = { Text(text = mode) },
                                    onClick = { selectedMode = mode; expand = false },
                                )
                            }

                        }
                    }

                }
            }

            Button(onClick = { showOrderDialog = true },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoffeeBrown,
                    contentColor = Color.White
                )
            ) {

                Text(
                    text = "Place order",
                    fontSize = 23.sp
                )

            }

            AppMessageDialog(
                show = showOrderDialog,
                title = "Order Placed",
                message = "Your order will be Arriving Soon",
                onDismiss = { showOrderDialog = false }
            )

        }

    }
}