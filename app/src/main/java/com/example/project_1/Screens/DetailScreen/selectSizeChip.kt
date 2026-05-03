package com.example.project_1.Screens.DetailScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@SuppressLint("SuspiciousIndentation")
@Composable
fun SelectSizeChip(sizeText: String, selected: Boolean, onClick: () -> Unit, modifier: Modifier) {

    val LightBrown = Color(0xFFC67C4E)

        Box(
            modifier = modifier
                .background(
                    color = if (selected) Color (color = 0xFFF7F0EB) else Color (color = 0xFFFDFDFD),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .border(width = 1.dp,
                    color = if (selected) Color (color = 0xFFC67C4E) else Color (color = 0xFFE1E1E1),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .height(height = 46.dp)
                .clickable { onClick() },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sizeText,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (selected) LightBrown else Color.DarkGray
            )
        }

}