package com.etu.bookcrossing.ui.auth.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.etu.bookcrossing.R

const val REGISTRATION_SUCCEED_COMPOSABLE_ID = "registration_succeed_screen"

@Composable
fun RegistrationSucceedComposable(navController: NavHostController) {
    Column(modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BookCrossing",
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Thank you for registration!", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {  },
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