package com.etu.bookcrossing.compose.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.etu.bookcrossing.BottomNavigationItem
import com.etu.bookcrossing.R

@Composable
fun NavigationBar(
    onNavigationClicked: (BottomNavigationItem) -> Unit,
    content: @Composable () -> Unit
) {

    Scaffold(
        bottomBar = { BottomNavigationBar(onNavigationClicked) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                content()
            }
        })
}

@Composable
fun BottomNavigationBar(onNavigationClicked: (BottomNavigationItem) -> Unit) {
    val items = BottomNavigationItem.values()

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.dark_green),
        contentColor = Color.White
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                    )
                },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = { onNavigationClicked(item) }
            )
        }
    }
}