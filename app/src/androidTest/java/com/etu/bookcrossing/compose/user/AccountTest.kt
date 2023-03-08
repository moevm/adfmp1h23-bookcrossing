package com.etu.bookcrossing.compose.user

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.etu.bookcrossing.ExecutableTest
import com.etu.bookcrossing.data.User
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class AccountTest : BaseUserTest() {

    var onTakeBooks: ExecutableTest = mockk(relaxUnitFun = true)

    var onRating: ExecutableTest = mockk(relaxUnitFun = true)

    @Test
    fun account_UserProvided_DisplayOnlyNecessaryUserInfo() {
        val expected = user

        composeTestRule.setContent {
            Account(user = expected, onTakenBooks = {}, onRating = {})
        }

        assertText(user.fullName())
        assertText(user.email)
        assertText(user.phone)
        assertNoText(user.surname)
        assertNoText(user.photoUrl)
    }

    @Test
    fun account_ClickOnRating_CallProvidedFunction() {
        composeTestRule.setContent {
            Account(user = user, onTakenBooks = onTakeBooks, onRating = onRating)
        }

        composeTestRule.onNodeWithText("Show rating").performClick().assertExists()

        verify { onRating() }
    }

    @Test
    fun account_ClickOnTakenBooks_CallProvidedFunction() {
        composeTestRule.setContent {
            Account(user = user, onTakenBooks = onTakeBooks, onRating = onRating)
        }

        composeTestRule.onNodeWithText("Taken books").performClick().assertExists()

        verify { onTakeBooks() }
    }

    companion object {
        private val user = User("Petr", "Petrov", "+123", "test@gmail.com", "123")
    }

}