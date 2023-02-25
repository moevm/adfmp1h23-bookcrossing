package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.etu.bookcrossing.R

@Composable
fun Account(onTakenBooks: () -> Unit, onRating: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .border(BorderStroke(1.dp, SolidColor(Color(R.color.dark_green))))
                    .width(250.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Petr Petrov",
                        style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
                    )
                    Text(
                        text = "Email",
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = "petya@gmail.com",
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Text(
                        text = "Phone",
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

                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(R.color.dark_green)
                        ),
                        onClick = onTakenBooks
                    ) {
                        Text("Taken books")
                    }
                }
            }

            Button(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.dark_green)
                ),
                onClick = onRating
            ) {
                Text("Show rating")
            }
        }
    }
}

@Composable
@Preview
fun AccountPreview() {
    Account(onRating = {}, onTakenBooks = {})
}