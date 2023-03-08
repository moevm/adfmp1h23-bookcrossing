package com.etu.bookcrossing.data

class Book(
    val name: String,
    val author: String,
    val description: String,
    val imageUrl: String
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (javaClass != other?.javaClass) {
            return false
        }

        other as Book

        if (name != other.name) {
            return false
        }
        if (author != other.author) {
            return false
        }

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }

    override fun toString(): String {
        return "Book(name='$name', author='$author')"
    }

}