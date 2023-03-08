package com.etu.bookcrossing.compose.books

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.ImageListItem
import com.etu.bookcrossing.compose.common.TextSearchBar
import com.etu.bookcrossing.data.Book
import com.etu.bookcrossing.viewmodel.BookListViewModel

@Composable
fun BookItem(book: Book) {
    ImageListItem(
        name = book.name,
        imageUrl = book.imageUrl,
        imageDescription = stringResource(R.string.book_image_description)
    ) {

    }
}

fun LazyGridScope.header(
    content: @Composable LazyGridItemScope.() -> Unit
) {
    item(span = { GridItemSpan(this.maxLineSpan) }, content = content)
}

@Composable
fun BooksList(viewModel: BookListViewModel = hiltViewModel()) {
    val books by remember(viewModel) {
        viewModel.loadBooks()
    }.collectAsState(initial = emptyList())

    val search = remember { mutableStateOf(String()) }
    val focusManager = LocalFocusManager.current

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        header {
            TextSearchBar(
                modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.padding_normal)),
                value = search.value,
                onDoneActionClick = { focusManager.clearFocus() },
                onValueChanged = { search.value = it },
                onClearClick = { search.value = String() })
        }

        items(items = books) {
            BookItem(book = it)
        }
    }
}
