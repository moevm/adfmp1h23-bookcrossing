package com.etu.bookcrossing.compose.map

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.etu.bookcrossing.BaseTest
import org.junit.Test

class BookPointTest : BaseTest() {
    var called = false

    private fun onTakeBook(formattedTakenMessage: String, undoMessage: String,
                   performed: () -> Unit, dismissed: () -> Unit) {
        called = true
        assert(formattedTakenMessage == "takenMessage!")
        assert(undoMessage == "undoMessage!")
    }

    @Test
    fun takeBook() {
        composeTestRule.setContent {
            TakeBookItem("name!", "takenMessage!", "undoMessage!", ::onTakeBook)
        }

        composeTestRule.onNodeWithText("Take").performClick()
        assert(called)
    }
}
