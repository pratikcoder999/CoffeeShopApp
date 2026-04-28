package com.example.project_1.Screens.Ui_Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val CoffeeBrown = Color(0xFFC47B4D)
@Composable
fun CategoryChip(
    text: String,
    isSelected: Boolean,
    onSelected: () -> Unit
) {

    Box(
        modifier = Modifier
            .width(95.dp)
            .height(30.dp)
            .clip(RoundedCornerShape(6.dp))
            .clickable{ onSelected() }
            .background(color = if (isSelected) CoffeeBrown else Color.LightGray),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
        )
    }

}