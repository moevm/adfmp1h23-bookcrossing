package com.etu.bookcrossing.compose.books

import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.Fixtures
import com.etu.bookcrossing.data.Book
import org.junit.Test

class BooksListTest : BaseTest() {

    fun assertPresent(book: Book) {
        assertText(book.name)
        assertNoText(book.author)
        assertNoText(book.description)
        assertNoText(book.imageUrl)
    }

    @Test
    fun booksList_ListOfBooksProvided_DisplayBooks() {
        val expected = Fixtures.books

        composeTestRule.setContent {
            BooksList(books = expected)
        }

        expected.forEach { assertPresent(it) }
    }

}