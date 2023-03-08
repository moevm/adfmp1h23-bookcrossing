package com.etu.bookcrossing.compose.user

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import com.etu.bookcrossing.BaseTest

open class BaseUserTest : BaseTest() {

    fun assertText(text: String) {
        composeTestRule.onNodeWithText(text).assertIsDisplayed()
    }

    fun assertNoText(text: String) {
        composeTestRule.onNodeWithText(text).assertDoesNotExist()
    }

}