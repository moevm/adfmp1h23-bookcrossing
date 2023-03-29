package com.etu.bookcrossing.compose.user.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.BookCrossingTextField
import com.etu.bookcrossing.compose.common.CursiveBigText

@Composable
fun Register(onRegister: () -> Unit) {
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.column_all_padding)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val name = remember { mutableStateOf(TextFieldValue()) }
        val surname = remember { mutableStateOf(TextFieldValue()) }
        val email = remember { mutableStateOf(TextFieldValue()) }
        val phone = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        val passwordConfirm = remember { mutableStateOf(TextFieldValue()) }

        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_name)) },
            value = name.value,
            onValueChange = { name.value = it }
        )
        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_surname)) },
            value = surname.value,
            onValueChange = { surname.value = it }
        )
        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_email)) },
            value = email.value,
            onValueChange = { email.value = it }
        )
        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_phone)) },
            value = phone.value,
            onValueChange = { phone.value = it }
        )
        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_password)) },
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it }
        )
        BookCrossingTextField(
            label = { Text(text = stringResource(R.string.register_field_password_confirm)) },
            value = passwordConfirm.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { passwordConfirm.value = it }
        )

        Button(
            onClick = onRegister,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Sign up")
        }
    }
}

@Composable
fun RegistrationSucceed(onSuccess: () -> Unit) {
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.column_all_padding)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CursiveBigText(text = stringResource(id = R.string.app_name))

        Text(text = stringResource(R.string.registration_success_message))

        Button(
            onClick = onSuccess,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(stringResource(R.string.registration_success_button))
        }
    }
}