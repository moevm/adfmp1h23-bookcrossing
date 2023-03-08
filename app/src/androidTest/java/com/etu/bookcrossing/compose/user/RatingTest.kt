package com.etu.bookcrossing.compose.user

import com.etu.bookcrossing.data.User
import org.junit.Test

class RatingTest : BaseUserTest() {

    fun assertPresent(user: User) {
        assertText(user.name)
        assertNoText(user.surname)
        assertNoText(user.photoUrl)
        assertNoText(user.email)
        assertNoText(user.phone)
    }

    @Test
    fun rating_ListOfUserRating_DisplayRating() {
        val expected = rating

        composeTestRule.setContent { Rating(expected) }

        expected.forEach { assertPresent(it) }
    }

    companion object {

        private val rating = (0..2L).map {
            User(
                "Petr".plus(it),
                "Petrov".plus(it),
                "+123",
                "email@gmail.com".plus(it),
                "some url".plus(it)
            )
        }
    }

}