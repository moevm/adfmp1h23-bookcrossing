package com.etu.bookcrossing.compose.user.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.BookCrossingTextField
import com.etu.bookcrossing.compose.common.CursiveBigText

@Composable
fun LoginComposable(
    onLogin: () -> Unit,
    onRegister: () -> Unit,
    onAbout: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.column_all_padding))
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val email = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        CursiveBigText(text = stringResource(id = R.string.app_name))

        BookCrossingTextField(
            label = {
                Text(
                    text = stringResource(R.string.login_email_field)
                )
            },
            value = email.value,
            onValueChange = { email.value = it })

        BookCrossingTextField(
            label = {
                Text(
                    text = stringResource(R.string.login_password_field)
                )
            },
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it })

        Button(
            onClick = onLogin,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(R.string.login_button))
        }

        Column {
            Text(
                textAlign = TextAlign.Center,
                text = stringResource(R.string.sign_up_invitation),
                fontSize = MaterialTheme.typography.body2.fontSize,
                color = MaterialTheme.typography.body2.color
            )

            Button(
                onClick = onRegister,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.sign_up_button),
                )
            }
        }

        Column {
            ClickableText(
                text = AnnotatedString(stringResource(R.string.about_clickable_text)),
                onClick = onAbout,
                style = TextStyle(color = Color.Gray)
            )
        }
    }
}
