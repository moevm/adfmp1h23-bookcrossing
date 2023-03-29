package com.etu.bookcrossing.compose.books.user.auth


import androidx.compose.ui.test.*
import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.Fixtures
import com.etu.bookcrossing.compose.about.About
import com.etu.bookcrossing.compose.user.auth.LoginComposable
import org.junit.Test

class LoginTest : BaseTest() {
    var calledLogin = false
    var calledRegister = false
    var calledAbout = false

    @Test
    fun getAboutScreen() {
        composeTestRule.setContent {
            LoginComposable(
                onLogin = { calledLogin = true },
                onRegister = { calledRegister = true },
                onAbout = { calledAbout = true })
        }

        composeTestRule.onNodeWithText("Login").performClick()
        composeTestRule.onNodeWithText("Create an account").performClick()
        composeTestRule.onNodeWithText("About").performClick()

        assert(calledLogin)
        assert(calledRegister)
        assert(calledAbout)
    }
}