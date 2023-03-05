package com.etu.bookcrossing.compose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.about.About
import com.etu.bookcrossing.compose.books.BooksList
import com.etu.bookcrossing.compose.common.NavigationBar
import com.etu.bookcrossing.compose.map.AddBookToPoint
import com.etu.bookcrossing.compose.map.AddNewBook
import com.etu.bookcrossing.compose.map.BookPoint
import com.etu.bookcrossing.compose.map.MapPage
import com.etu.bookcrossing.compose.user.Account
import com.etu.bookcrossing.compose.user.Rating
import com.etu.bookcrossing.compose.user.TakenBooks
import com.etu.bookcrossing.compose.user.auth.LoginComposable
import com.etu.bookcrossing.compose.user.auth.Register
import com.etu.bookcrossing.compose.user.auth.RegistrationSucceed
import com.etu.bookcrossing.ui.theme.BookCrossingTheme

@Composable
fun BookCrossingApp() {
    BookCrossingTheme {
        RoutingBase()
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
                onRegister = { navController.navigate(NavigationRoute.REGISTER.name) },
                onAbout = { navController.navigate(NavigationRoute.ABOUT.name) }
            )
        }

        composable("${NavigationRoute.ADD_NEW_BOOK}/{${NavigationArgument.ADDRESS}}") {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    AddNewBook(address = address, onAddBook = {})
                }
            }
        }

        composable("${NavigationRoute.ADD_BOOK_TO_POINT}/{${NavigationArgument.ADDRESS}}") {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    AddBookToPoint(
                        address = address,
                        onChoose = {},
                        onAddNew = { navController.navigate("${NavigationRoute.ADD_NEW_BOOK}/${address}") })
                }
            }
        }

        composable("${NavigationRoute.POINT}/{${NavigationArgument.ADDRESS}}") {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    BookPoint(
                        address = address,
                        onTakeBook = {},
                        onAddBook = { navController.navigate("${NavigationRoute.ADD_BOOK_TO_POINT}/${address}") })
                }
            }
        }

        composable(NavigationRoute.REGISTER.name) {
            Register(onRegister = { navController.navigate(NavigationRoute.REGISTER_SUCCESS.name) })
        }

        composable(NavigationRoute.REGISTER_SUCCESS.name) {
            RegistrationSucceed(onSuccess = { navController.navigate(NavigationRoute.ACCOUNT.name) })
        }

        composable(NavigationRoute.ABOUT.name) {
            About()
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
                TakenBooks(onReturnBook = {})
            }
        }

        composable(NavigationRoute.MAP.name) {
            NavigationBar(onNavigationClicked = onNavigationClicked) {
                MapPage(onShowBooks = { navController.navigate("${NavigationRoute.POINT}/$it") })
            }
        }

    }
}

enum class NavigationArgument {
    ADDRESS
}

enum class NavigationRoute {
    ACCOUNT,
    BOOKS,
    TAKEN_BOOKS,
    RATING,
    LOGIN,
    MAP,
    POINT,
    ADD_BOOK_TO_POINT,
    ADD_NEW_BOOK,
    REGISTER,
    REGISTER_SUCCESS,
    ABOUT,
}

enum class BottomNavigationItem(
    var route: NavigationRoute,
    @DrawableRes var icon: Int,
    var title: String
) {
    ACCOUNT(NavigationRoute.ACCOUNT, R.drawable.account_circle, "Account"),
    MAP(NavigationRoute.MAP, R.drawable.location_on, "Map"),
    BOOKS(NavigationRoute.BOOKS, R.drawable.menu_book, "Books"),
}