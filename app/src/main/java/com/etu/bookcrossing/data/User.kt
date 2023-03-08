package com.etu.bookcrossing.data

data class User(
    val name: String,
    val surname: String,
    val phone: String,
    val email: String,
    val photoUrl: String
) {

    fun fullName(): String {
        return name.plus(" ").plus(surname)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }

        other as User

        if (name != other.name) {
            return false
        }
        if (surname != other.surname) {
            return false
        }
        if (phone != other.phone) {
            return false
        }
        if (email != other.email) {
            return false
        }

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + phone.hashCode()
        result = 31 * result + email.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(name='$name', surname='$surname', phone='$phone', email='$email')"
    }

}