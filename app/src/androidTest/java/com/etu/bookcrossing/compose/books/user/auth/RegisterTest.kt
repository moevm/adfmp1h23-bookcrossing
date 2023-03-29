package com.etu.bookcrossing.compose.books.user.auth

import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.compose.user.auth.Register
import org.junit.Test

class RegisterTest : BaseTest() {
    var calledOnRegister = false
    var calledRegister = false
    var calledAbout = false

    @Test
    fun getAboutScreen() {
        composeTestRule.setContent {
            Register(onRegister = { calledOnRegister = true })
        }

        composeTestRule.onNodeWithText("Sign up").performClick()
        assert(calledOnRegister)
    }
}