package com.etu.bookcrossing

import com.etu.bookcrossing.data.Book
import com.etu.bookcrossing.data.User

class Fixtures {

    companion object {
        val users = (0..2L).map {
            User(
                "Petr".plus(it),
                "Petrov".plus(it),
                "+123",
                "email@gmail.com".plus(it),
                "some url".plus(it)
            )
        }

        val books = (0L..2).map {
            Book(
                it.toString(),
                "some author",
                "some description",
                "some url"
            )
        }

        val booksNames = books.map { it.name }

        val user = users.first()
    }
}