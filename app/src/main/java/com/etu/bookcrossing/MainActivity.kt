package com.etu.bookcrossing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.etu.bookcrossing.compose.auth.LoginComposable
import com.etu.bookcrossing.compose.auth.Register
import com.etu.bookcrossing.compose.auth.RegistrationSucceed
import com.etu.bookcrossing.compose.books.BooksList
import com.etu.bookcrossing.compose.common.NavigationBar
import com.etu.bookcrossing.compose.user.Account
import com.etu.bookcrossing.compose.user.Rating
import com.etu.bookcrossing.compose.user.TakenBooks
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RoutingBase()
        }
    }
}

@Composable
fun RoutingBase() {
    val navController = rememberNavController()
    val onNavigationClicked: (BottomNavigationItem) -> Unit = {
        navController.navigate(it.route.name) {

            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
            }

            launchSingleTop = true
            restoreState = true
        }
    }

    NavHost(navController, startDestination = NavigationRoute.LOGIN.name) {
        composable(NavigationRoute.LOGIN.name) {
            LoginComposable(onLogin = { navController.navigate(NavigationRoute.ACCOUNT.name) },
                onRegister = { navController.navigate(NavigationRoute.REGISTER.name) })
        }

        composable(NavigationRoute.REGISTER.name) {
            Register(onRegister = { navController.navigate(NavigationRoute.REGISTER_SUCCESS.name) })
        }

        composable(NavigationRoute.REGISTER_SUCCESS.name) {
            RegistrationSucceed(onSuccess = { navController.navigate(NavigationRoute.ACCOUNT.name) })
        }

        composable(NavigationRoute.ACCOUNT.name) {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                Account(
                    onTakenBooks = { navController.navigate(NavigationRoute.TAKEN_BOOKS.name) },
                    onRating = { navController.navigate(NavigationRoute.RATING.name) })
            }
        }

        composable(NavigationRoute.BOOKS.name) {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                BooksList()
            }
        }

        composable(NavigationRoute.RATING.name) {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                Rating()
            }
        }

        composable(NavigationRoute.TAKEN_BOOKS.name) {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                TakenBooks(onTaken = {})
            }
        }

    }
}

enum class NavigationRoute {
    ACCOUNT,
    BOOKS,
    TAKEN_BOOKS,
    RATING,
    LOGIN,
    REGISTER,
    REGISTER_SUCCESS
}

enum class BottomNavigationItem(var route: NavigationRoute, var icon: Int, var title: String) {
    ACCOUNT(NavigationRoute.ACCOUNT, R.drawable.account_circle, "Account"),
    BOOKS(NavigationRoute.BOOKS, R.drawable.menu_book, "Books")
}