package com.etu.bookcrossing.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.etu.bookcrossing.ui.auth.REGISTER_COMPOSABLE_ID
import com.etu.bookcrossing.ui.auth.RegisterComposable
import com.etu.bookcrossing.ui.auth.SIGN_IN_COMPOSABLE_ID
import com.etu.bookcrossing.ui.auth.LoginComposable
import com.etu.bookcrossing.ui.auth.register.REGISTRATION_SUCCEED_COMPOSABLE_ID
import com.etu.bookcrossing.ui.auth.register.RegistrationSucceedComposable
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
    NavHost(navController, startDestination=SIGN_IN_COMPOSABLE_ID) {
        composable(SIGN_IN_COMPOSABLE_ID) {
            LoginComposable(navController)
        }

        composable(REGISTER_COMPOSABLE_ID) {
            RegisterComposable(navController)
        }

        composable(REGISTRATION_SUCCEED_COMPOSABLE_ID) {
            RegistrationSucceedComposable(navController)
        }
    }
}
