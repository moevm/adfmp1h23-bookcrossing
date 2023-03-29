package com.etu.bookcrossing.data

class Book(
    val name: String,
    val author: String,
    val description: String,
    val imageUrl: String
) {
    override fun equals(other: Any?): Boolean =
        this === other || other is Book && name == other.name && author == other.author

    override fun toString(): String = "Book(name='$name', author='$author')"

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }
}