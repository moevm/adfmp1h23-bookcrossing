package com.etu.bookcrossing.compose.books

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import com.etu.bookcrossing.compose.list.ImageListItem
import com.etu.bookcrossing.data.Book

@Composable
fun BookItem(book: Book) {
    ImageListItem(name = book.name) {

    }
}

@Composable
fun BooksList(books: List<Book> = BOOKS_LIST) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(
            count = books.size,
            key = { it }
        ) { book ->
            BookItem(book = books[book])
        }
    }
}

val BOOKS_LIST = listOf(
    Book(
        "It Ends with Us",
        "Colleen Hoover",
        "Lily hasn’t always had it easy, but that’s never stopped her from working hard for the life she wants. She’s come a long way from the small town where she grew up—she graduated from college, moved to Boston, and started her own business. And when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything in Lily’s life seems too good to be true"
    ),
    Book(
        "It Starts with Us",
        "Colleen Hoover",
        "Lily and her ex-husband, Ryle, have just settled into a civil coparenting rhythm when she suddenly bumps into her first love, Atlas, again. After nearly two years separated, she is elated that for once, time is on their side, and she immediately says yes when Atlas asks her on a date."
    )
)
