package com.etu.bookcrossing.compose.books

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.ImageListItem
import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.viewmodel.BookListViewModel

@Composable
fun BookItem(book: BookEntity) {
    ImageListItem(
        name = book.name,
        imageUrl = book.imageUrl,
        imageDescription = stringResource(R.string.book_image_description)
    ) {

    }
}

@Composable
fun BooksList(viewModel: BookListViewModel = hiltViewModel()) {
    val books by remember(viewModel) {
        viewModel.loadBooks()
    }.collectAsState(initial = emptyList())

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(items = books) {
            BookItem(book = it)
        }
    }
}
