package com.etu.bookcrossing.compose.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.etu.bookcrossing.R

@Composable
fun LoginComposable(
    onLogin: () -> Unit,
    onRegister: () -> Unit
) {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val email = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "BookCrossing",
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Email") },
            value = email.value,
            onValueChange = { email.value = it })

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Password") },
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it })

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = onLogin,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.dark_green)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Login")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Do not have an account yet?", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = onRegister,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.dark_green)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Create an account")
            }
        }
    }
}
