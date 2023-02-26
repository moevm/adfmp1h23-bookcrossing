package com.etu.bookcrossing.compose.common

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily

@Composable
fun CursiveBigText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontFamily = FontFamily.Cursive
        )
    )
}