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
fun Register(onRegister: () -> Unit) {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val name = remember { mutableStateOf(TextFieldValue()) }
        val surname = remember { mutableStateOf(TextFieldValue()) }
        val email = remember { mutableStateOf(TextFieldValue()) }
        val phone = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        val passwordConfirm = remember { mutableStateOf(TextFieldValue()) }

        Spacer(modifier = Modifier.height(100.dp))
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
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Password confirm") },
            value = passwordConfirm.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { passwordConfirm.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))
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
                Text("Sign up")
            }
        }
    }
}

@Composable
fun RegistrationSucceed(onSuccess: () -> Unit) {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "BookCrossing",
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Thank you for registration!", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = onSuccess,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.dark_green)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Start using")
            }
        }
    }
}