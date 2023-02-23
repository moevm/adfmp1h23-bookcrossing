package com.etu.bookcrossing.ui.auth.register

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

const val REGISTRATION_SUCCEED_COMPOSABLE_ID = "registration_succeed_screen"

@Composable
fun RegistrationSucceedComposable(navController: NavHostController) {
    Column {
        Text(text = "Here should be our logo")
        Text(text = "Thank you for registration")
        Button(onClick = { }) {
            Text(text = "Start using")
        }
    }
}