package com.etu.bookcrossing.compose.user

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import com.etu.bookcrossing.database.entity.UserEntity
import org.junit.Rule
import org.junit.Test

class RatingTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    fun assertText(text: String) {
        composeTestRule.onNode(hasText(text)).assertIsDisplayed()
    }

    fun assertNoText(text: String) {
        composeTestRule.onNode(hasText(text)).assertDoesNotExist()
    }

    fun assertPresent(userEntity: UserEntity) {
        assertText(userEntity.name)
        assertNoText(userEntity.email)
        assertNoText(userEntity.surname)
        assertNoText(userEntity.password)
        assertNoText(userEntity.photoUrl)
    }

    @Test
    fun rating_ListOfUserRating_DisplayRating() {
        val expected = rating

        composeTestRule.setContent { Rating(expected) }

        expected.forEach { assertPresent(it) }
    }

    companion object {

        private val rating = (0..2L).map {
            UserEntity(
                it,
                "Petr".plus(it),
                "Petrov".plus(it),
                "email@gmail.com".plus(it),
                "password".plus(it),
                "some url".plus(it)
            )
        }
    }

}