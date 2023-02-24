package com.etu.bookcrossing.compose.account

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.etu.bookcrossing.R

const val ACCOUNT_ROUTE = "account"

@Composable
fun Account() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {

        Box(
            modifier = Modifier.border(BorderStroke(1.dp, SolidColor(Color(R.color.dark_green))))
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
                    onClick = {},
                ) {
                    Text("Taken books")
                }
            }
        }

    }

}