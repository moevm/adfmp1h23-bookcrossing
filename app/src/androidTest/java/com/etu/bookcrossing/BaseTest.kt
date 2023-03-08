package com.etu.bookcrossing

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule

open class BaseTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    fun assertText(text: String) {
        composeTestRule.onNodeWithText(text).assertIsDisplayed()
    }

    fun assertNoText(text: String) {
        composeTestRule.onNodeWithText(text).assertDoesNotExist()
    }

}