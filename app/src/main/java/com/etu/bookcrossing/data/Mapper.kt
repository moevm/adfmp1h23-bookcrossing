package com.etu.bookcrossing.data

import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.entity.UserEntity

fun UserEntity.toUser(): User =
    User(this.name, this.surname, this.phone, this.email, this.photoUrl)

fun BookEntity.toBook(): Book =
    Book(this.name, this.author, this.description, this.imageUrl)
