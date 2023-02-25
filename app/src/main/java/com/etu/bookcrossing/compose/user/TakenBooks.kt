package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.RowsWithTextHeader
import com.etu.bookcrossing.viewmodel.TakenBooksViewModel

@Composable
fun TakenBookItem(name: String, onTaken: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(BorderStroke(0.25.dp, SolidColor(Color(R.color.dark_green)))),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = name, fontSize = 20.sp, color = Color.Gray, modifier = Modifier.weight(1f))

        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(R.color.dark_green)
            ),
            onClick = onTaken
        ) {
            Text("Return book")
        }
    }
}

@Composable
fun TakenBooks(viewModel: TakenBooksViewModel = hiltViewModel(), onTaken: () -> Unit) {
    val bookNames by remember(viewModel) {
        viewModel.loadTakenBooksNames()
    }.collectAsState(initial = emptyList())

    RowsWithTextHeader(
        headerText = "Taken Books",
        elements = bookNames,
        consumer = { TakenBookItem(name = it, onTaken = onTaken) }
    )

}