package com.etu.bookcrossing.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColors(
    primary = DarkGreen,
    secondary = DarkGreen,
    onSurface = Color.Transparent,
)

@Composable
fun BookCrossingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColors,
    ) {
        content()
    }
}