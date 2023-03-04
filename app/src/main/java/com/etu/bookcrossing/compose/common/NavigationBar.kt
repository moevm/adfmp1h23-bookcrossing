package com.etu.bookcrossing.compose.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.etu.bookcrossing.compose.BottomNavigationItem

@Composable
fun NavigationBar(
    onNavigationClicked: (BottomNavigationItem) -> Unit,
    scaffoldState: ScaffoldState,
    content: @Composable () -> Unit
) {
    Scaffold(
        scaffoldState = scaffoldState,
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

    BottomNavigation {
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
                alwaysShowLabel = true,
                selected = false,
                onClick = { onNavigationClicked(item) }
            )
        }
    }
}