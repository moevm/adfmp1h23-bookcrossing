package com.etu.bookcrossing.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColors = lightColors(
    primary = DarkGreen,
    secondary = DarkGreen
)

@Composable
fun BookCrossingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColors,
    ) {
        content()
    }
}