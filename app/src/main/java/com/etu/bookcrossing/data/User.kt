package com.etu.bookcrossing.data

data class User(
    val name: String,
    val surname: String,
    val phone: String,
    val email: String,
    val photoUrl: String
) {
    fun fullName() = name.plus(" ").plus(surname)

    override fun equals(other: Any?) =
        this === other ||
                other is User && name == other.name && surname == other.surname
                              && phone == other.phone && email == other.email

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + phone.hashCode()
        result = 31 * result + email.hashCode()
        return result
    }

    override fun toString() =
        "User(name='$name', surname='$surname', phone='$phone', email='$email')"
}