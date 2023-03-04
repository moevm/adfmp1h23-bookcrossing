package com.etu.bookcrossing.compose

import androidx.annotation.DrawableRes
import androidx.compose.material.SnackbarResult
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.etu.bookcrossing.R
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
import kotlinx.coroutines.launch

typealias Performed = () -> Unit
typealias Dismissed = () -> Unit
typealias Message = String
typealias Label = String
typealias ShowSnackbar = (Message, Label, Performed, Dismissed) -> Unit

@Composable
fun BookCrossingApp() {
    BookCrossingTheme {
        RoutingBase()
    }
}

@Composable
fun RoutingBase() {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()

    val onSnackBar: ShowSnackbar = { message, label, performed, dissmissed ->
        coroutineScope.launch {
            val snackbarResult = scaffoldState.snackbarHostState.showSnackbar(
                message = message,
                actionLabel = label
            )

            when (snackbarResult) {
                SnackbarResult.Dismissed -> dissmissed()
                SnackbarResult.ActionPerformed -> performed()
            }
        }
    }

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

    val navigationBar: @Composable (@Composable () -> Unit) -> Unit = {
        NavigationBar(onNavigationClicked = onNavigationClicked, scaffoldState = scaffoldState) {
            it()
        }
    }

    NavHost(navController, startDestination = NavigationRoute.LOGIN.name) {
        composable(NavigationRoute.LOGIN.name) {
            LoginComposable(onLogin = { navController.navigate(NavigationRoute.ACCOUNT.name) },
                onRegister = { navController.navigate(NavigationRoute.REGISTER.name) })
        }

        composable("${NavigationRoute.ADD_NEW_BOOK}/{${NavigationArgument.ADDRESS}}") {
            navigationBar {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    AddNewBook(address = address, onAddBook = {})
                }
            }
        }

        composable("${NavigationRoute.ADD_BOOK_TO_POINT}/{${NavigationArgument.ADDRESS}}") {
            navigationBar {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    AddBookToPoint(
                        address = address,
                        onChoose = {},
                        onAddNew = { navController.navigate("${NavigationRoute.ADD_NEW_BOOK}/${address}") })
                }
            }
        }

        composable("${NavigationRoute.POINT}/{${NavigationArgument.ADDRESS}}") {
            navigationBar {
                it.arguments?.getString(NavigationArgument.ADDRESS.name)?.let { address ->
                    BookPoint(
                        address = address,
                        onTakeBook = onSnackBar,
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

        composable(NavigationRoute.ACCOUNT.name) {
            navigationBar {
                Account(
                    onTakenBooks = { navController.navigate(NavigationRoute.TAKEN_BOOKS.name) },
                    onRating = { navController.navigate(NavigationRoute.RATING.name) })
            }
        }

        composable(NavigationRoute.BOOKS.name) {
            navigationBar {
                BooksList()
            }
        }

        composable(NavigationRoute.RATING.name) {
            navigationBar {
                Rating()
            }
        }

        composable(NavigationRoute.TAKEN_BOOKS.name) {
            navigationBar {
                TakenBooks(onReturnBook = onSnackBar)
            }
        }

        composable(NavigationRoute.MAP.name) {
            navigationBar {
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
    REGISTER_SUCCESS
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