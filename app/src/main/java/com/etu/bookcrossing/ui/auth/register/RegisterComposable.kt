package com.etu.bookcrossing.ui.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.navigation.NavHostController
import com.etu.bookcrossing.ui.auth.register.REGISTRATION_SUCCEED_COMPOSABLE_ID

const val REGISTER_COMPOSABLE_ID = "register_screen"

@Composable
fun RegisterComposable(navController: NavHostController) {
    var name by rememberSaveable { mutableStateOf("") }
    var surname by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var phone by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var password_confirm by rememberSaveable { mutableStateOf("") }

    Column {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        TextField(
            value = surname,
            onValueChange = { surname = it },
            label = { Text("Surname") }
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )
        TextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text("Phone") }
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        TextField(
            value = password_confirm,
            onValueChange = { password_confirm = it },
            label = { Text("Enter password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(onClick = { navController.navigate(REGISTRATION_SUCCEED_COMPOSABLE_ID) }) {
            Text(text = "Sign up")
        }
    }
}