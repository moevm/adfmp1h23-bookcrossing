package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.CursiveBigText

@Composable
fun Account(onTakenBooks: () -> Unit, onRating: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .border(
                        BorderStroke(
                            dimensionResource(id = R.dimen.border_big_size),
                            SolidColor(MaterialTheme.colors.primary)
                        )
                    )
                    .width(dimensionResource(id = R.dimen.centered_box_width))
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    CursiveBigText(text = "Petr Petrov")
                    Text(
                        text = stringResource(R.string.account_email_field),
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = "petya@gmail.com",
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = stringResource(R.string.account_phone_field),
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = "+7 999 999 99 99",
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = "Added 0 books",
                        modifier = Modifier.align(Alignment.Start)
                    )

                    Button(onClick = onTakenBooks) {
                        Text(stringResource(R.string.taken_books_button))
                    }
                }
            }

            Button(onClick = onRating) {
                Text(stringResource(R.string.show_rating_button))
            }
        }
    }
}

@Composable
@Preview
fun AccountPreview() {
    Account(onRating = {}, onTakenBooks = {})
}