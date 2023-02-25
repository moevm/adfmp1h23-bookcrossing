package com.etu.bookcrossing.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "book")
class BookEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val bookId: Long,
    val name: String,
    val author: String,
    val description: String,
    @field:SerializedName("image_url") val imageUrl: String
)