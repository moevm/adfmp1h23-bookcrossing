package com.etu.bookcrossing.compose.user

import com.etu.bookcrossing.BaseTest
import com.etu.bookcrossing.Fixtures
import com.etu.bookcrossing.data.User
import org.junit.Test

class RatingTest : BaseTest() {
    fun assertPresent(user: User) {
        assertText(user.name)
        assertNoText(user.surname)
        assertNoText(user.photoUrl)
        assertNoText(user.email)
        assertNoText(user.phone)
    }

    @Test
    fun rating_ListOfUserRating_DisplayRating() {
        val expected = Fixtures.users

        composeTestRule.setContent { Rating(expected) }

        expected.forEach { assertPresent(it) }
    }

}