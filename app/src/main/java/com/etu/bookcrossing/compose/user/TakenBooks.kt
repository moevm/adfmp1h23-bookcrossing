package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.ShowSnackbar
import com.etu.bookcrossing.compose.common.RowsWithTextHeader
import com.etu.bookcrossing.viewmodel.TakenBooksViewModel

@Composable
fun TakenBookItem(
    name: String,
    returnedMessage: String,
    undoMessage: String,
    onReturnBook: ShowSnackbar
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = name,
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = MaterialTheme.typography.h6.color,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(id = R.dimen.padding_normal))
        )

        Button(onClick = { onReturnBook(returnedMessage.format(name), undoMessage, {}, {}) }) {
            Text(stringResource(R.string.return_book_button))
        }
    }
}

@Composable
fun TakenBooks(viewModel: TakenBooksViewModel = hiltViewModel(), onReturnBook: ShowSnackbar) {
    val bookNames by remember(viewModel) {
        viewModel.loadTakenBooksNames()
    }.collectAsState(initial = emptyList())

    val undoMessage = stringResource(id = R.string.undo)
    val returnedMessage = stringResource(id = R.string.element_returned_message)

    RowsWithTextHeader(
        headerText = stringResource(R.string.taken_books_header),
        elements = bookNames,
        consumer = {
            TakenBookItem(
                name = it,
                onReturnBook = onReturnBook,
                undoMessage = undoMessage,
                returnedMessage = returnedMessage
            )
        }
    )
}