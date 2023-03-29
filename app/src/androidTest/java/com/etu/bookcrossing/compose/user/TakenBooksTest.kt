package com.etu.bookcrossing.compose.user

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.performClick
import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.Fixtures
import com.etu.bookcrossing.ShowSnackBarTest
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class TakenBooksTest : BaseTest() {
    var onReturn: ShowSnackBarTest = mockk(relaxUnitFun = true)

    @Test
    fun takenBooks_ListOfBookProvided_DisplayBooks() {
        val expected = Fixtures.booksNames

        composeTestRule.setContent { TakenBooks(books = expected, onReturnBook = onReturn) }

        expected.forEach { assertText(it) }
    }

    @Test
    fun takenBooks_ReturnBookClicked_CallAction() {
        val expected = Fixtures.booksNames

        composeTestRule.setContent { TakenBooks(books = expected, onReturnBook = onReturn) }

        composeTestRule.onAllNodes(hasText(returnBookButton))[0].performClick()

        verify { onReturn(any(), eq("Undo"), any(), any()) }
    }

    @Test
    fun takenBooks_NoBooks_NoButtons() {
        composeTestRule.setContent { TakenBooks(books = emptyList(), onReturnBook = onReturn) }

        assertNoText(returnBookButton)
    }

    companion object {
        const val returnBookButton = "Return book"
    }

}