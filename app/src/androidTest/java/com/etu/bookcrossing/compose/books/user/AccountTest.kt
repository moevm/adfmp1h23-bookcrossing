package com.etu.bookcrossing.compose.books.user

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.compose.user.Account
import org.junit.Test

class AccountTest : BaseTest() {
    var calledOnTakenBooks = false
    var calledOnRating = false

    @Test
    fun getAboutScreen() {
        composeTestRule.setContent {
            Account(
                onTakenBooks = { calledOnTakenBooks = true },
                onRating = { calledOnRating = true })
        }

        composeTestRule.onNodeWithText("Show rating").performClick()
        composeTestRule.onNodeWithText("Taken books").performClick()

        assert(calledOnTakenBooks)
        assert(calledOnRating)
    }
}
