package com.etu.bookcrossing.compose.map

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.BookCrossingTextField
import com.etu.bookcrossing.compose.common.CursiveBigText
import com.etu.bookcrossing.compose.common.TextSearchBar

val books = listOf(
    "Book 1, Author 1",
    "Book 2, Author 1",
    "Book 3, Author 2",
)

@Composable
fun TakeBookItem(name: String, onTakeBook: () -> Unit) {
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

        Button(
            onClick = onTakeBook,
            modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.padding_normal))
        ) {
            Text(text = stringResource(R.string.take_book_button))
        }
    }
}

@Composable
fun AddBookItem(name: String, onChoose: (String) -> Unit) {
    Row {
        Text(
            text = name,
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = MaterialTheme.typography.h6.color,
            modifier = Modifier.weight(1f).padding(dimensionResource(id = R.dimen.padding_normal))
        )

        IconButton(onClick = { onChoose(name) }) {
            Icon(
                painter = painterResource(id = R.drawable.add),
                contentDescription = null,
            )
        }
    }
}

@Composable
fun AddNewBook(address: String, onAddBook: () -> Unit) {
    val name = remember { mutableStateOf(TextFieldValue()) }
    val author = remember { mutableStateOf(TextFieldValue()) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CursiveBigText(text = address)

            BookCrossingTextField(
                label = { Text(text = stringResource(R.string.add_book_name_textfield)) },
                value = name.value,
                onValueChange = { name.value = it }
            )

            BookCrossingTextField(
                label = { Text(text = stringResource(R.string.add_book_author_textfield)) },
                value = author.value,
                onValueChange = { author.value = it }
            )

            Row {
                Icon(
                    painter = painterResource(id = R.drawable.add_a_photo),
                    contentDescription = null,
                )

                Text(
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_normal)),
                    text = stringResource(R.string.upload_a_photo_invitation),
                    fontSize = MaterialTheme.typography.subtitle1.fontSize
                )
            }


            Button(
                onClick = onAddBook,
            ) {
                Text(text = stringResource(R.string.add_new_book_button))
            }
        }
    }
}

@Composable
fun AddBookToPoint(address: String, onChoose: () -> Unit, onAddNew: () -> Unit) {
    val search = remember { mutableStateOf(String()) }
    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.align(Alignment.TopStart),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextSearchBar(
                value = search.value,
                onDoneActionClick = { focusManager.clearFocus() },
                onValueChanged = { search.value = it },
                onClearClick = { search.value = String() })

            Text(
                text = stringResource(R.string.add_new_book_invitation),
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            )

            Button(
                onClick = onAddNew,
            ) {
                Text(text = stringResource(R.string.add_new_book_button))
            }

            books.forEach { AddBookItem(name = it, onChoose = {}) }
        }
    }
}

@Composable
fun BookPoint(address: String, onTakeBook: () -> Unit, onAddBook: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.align(Alignment.TopStart),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CursiveBigText(text = address)

            Button(
                onClick = onAddBook,
            ) {
                Text(text = stringResource(R.string.add_book_to_the_point_button))
            }

            books.forEach { TakeBookItem(name = it, onTakeBook = onTakeBook) }
        }
    }
}

@Composable
@Preview
fun BookPointPreview() {
    BookPoint(address = "Popova 6", onTakeBook = {}) {

    }
}

@Composable
@Preview
fun AddNewBookPreview() {
    AddNewBook(address = "Popova 3") {

    }
}