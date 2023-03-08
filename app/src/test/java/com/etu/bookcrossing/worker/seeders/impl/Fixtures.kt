package com.etu.bookcrossing.worker.seeders.impl

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.entity.UserEntity

class Fixtures {

    companion object {
        val books = (0L..2).map {
            BookEntity(
                it,
                it.toString(),
                "some author",
                "some description",
                "some url"
            )
        }

        val users = (0L..5).map {
            UserEntity(
                it,
                "Petr #$it",
                "Petrov #$it",
                "email@gmail.com",
                "+7 999 99 99 99 99999",
                "password",
                "some url"
            )
        }

        val booksNames = listOf(
            "Book1",
            "Book2",
            "Peace and war",
            "Shrek"
        )
    }

}