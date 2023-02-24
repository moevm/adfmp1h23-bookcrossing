package com.etu.bookcrossing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.etu.bookcrossing.compose.account.ACCOUNT_ROUTE
import com.etu.bookcrossing.compose.account.Account
import com.etu.bookcrossing.compose.auth.*
import com.etu.bookcrossing.compose.books.BOOKS_ROUTE
import com.etu.bookcrossing.compose.books.BooksList
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()

            Scaffold(
                bottomBar = { BottomNavigationBar(navController) },
                content = { padding ->
                    Box(modifier = Modifier.padding(padding)) {
                        RoutingBase(navController)
                    }
                })
        }
    }
}

@Composable
fun RoutingBase(navController: NavHostController) {
    NavHost(navController, startDestination = SIGN_IN_ROUTE) {
        composable(SIGN_IN_ROUTE) {
            LoginComposable(navController)
        }

        composable(REGISTER_ROUTE) {
            Register(navController)
        }

        composable(REGISTRATION_SUCCEED_ROUTE) {
            RegistrationSucceed(navController)
        }

        composable(ACCOUNT_ROUTE) {
            Account()
        }

        composable(BOOKS_ROUTE) {
            BooksList()
        }

    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Account,
        NavigationItem.Books,
    )
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
                onClick = {

                    navController.navigate(item.route) {

                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Account : NavigationItem(ACCOUNT_ROUTE, R.drawable.account_circle, "Account")
    object Books : NavigationItem(BOOKS_ROUTE, R.drawable.menu_book, "Books")
}