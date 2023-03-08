package com.etu.bookcrossing.data

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.entity.UserEntity


fun UserEntity.toUser(): User {
    return User(this.name, this.surname, this.phone, this.email, this.photoUrl)
}

fun BookEntity.toBook(): Book {
    return Book(this.name, this.author, this.description, this.imageUrl)
}