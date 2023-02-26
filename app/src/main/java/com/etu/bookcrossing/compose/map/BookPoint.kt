package com.etu.bookcrossing.compose.map

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.RowsWithTextHeader


@Composable
fun FreeBookItem(name: String, onTakeBook: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = name,
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = MaterialTheme.typography.h6.color,
            modifier = Modifier.weight(1f)
        )

        Button(onClick = onTakeBook) {
            Text(text = stringResource(R.string.take_book_button))
        }
    }
}

@Composable
fun BookPoint(address: String, onTakeBook: () -> Unit) {
    val books = listOf(
        "Book 1, Author 1",
        "Book 2, Author 1",
        "Book 3, Author 2",
    )

    RowsWithTextHeader(
        headerText = address,
        elements = books,
        consumer = { FreeBookItem(name = it, onTakeBook = onTakeBook) })
}