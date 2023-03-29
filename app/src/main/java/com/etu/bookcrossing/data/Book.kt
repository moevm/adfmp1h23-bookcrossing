package com.etu.bookcrossing.data

class Book(
    val name: String,
    val author: String,
    val description: String,
    val imageUrl: String
) {
    override fun equals(other: Any?) =
        this === other || other is Book && name == other.name && author == other.author

    override fun toString()= "Book(name='$name', author='$author')"

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }
}