package com.etu.bookcrossing.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user")
class UserEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val userId: Long,
    val name: String,
    val surname: String,
    val email: String,
    val phone: String,
    val password: String,
    @field:SerializedName("photo_url") val photoUrl: String
) {
    override fun equals(other: Any?) =
        this === other || other is UserEntity && userId == other.userId

    override fun hashCode() = userId.hashCode()
}