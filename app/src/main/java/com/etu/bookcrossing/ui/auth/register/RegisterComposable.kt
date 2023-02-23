package com.etu.bookcrossing.ui.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.etu.bookcrossing.R
import com.etu.bookcrossing.ui.auth.register.REGISTRATION_SUCCEED_COMPOSABLE_ID

const val REGISTER_COMPOSABLE_ID = "register_screen"

@Composable
fun RegisterComposable(navController: NavHostController) {
    Column(modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name = remember { mutableStateOf(TextFieldValue()) }
        var surname = remember { mutableStateOf(TextFieldValue()) }
        var email = remember { mutableStateOf(TextFieldValue()) }
        var phone = remember { mutableStateOf(TextFieldValue()) }
        var password = remember { mutableStateOf(TextFieldValue()) }
        var password_confirm = remember { mutableStateOf(TextFieldValue()) }

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Name") },
            value = name.value,
            onValueChange = { name.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Surname") },
            value = surname.value,
            onValueChange = { surname.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Email") },
            value = email.value,
            onValueChange = { email.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Phone") },
            value = phone.value,
            onValueChange = { phone.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Password") },
            value = password.value,
            onValueChange = { password.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Password confirm") },
            value = password_confirm.value,
            onValueChange = { password_confirm.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = { navController.navigate(REGISTRATION_SUCCEED_COMPOSABLE_ID) },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.dark_green)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Sign up")
            }
        }
    }
}