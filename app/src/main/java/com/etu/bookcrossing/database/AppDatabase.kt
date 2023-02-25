package com.etu.bookcrossing.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.etu.bookcrossing.database.dao.BookDao
import com.etu.bookcrossing.database.dao.UserDao
import com.etu.bookcrossing.database.entity.BookEntity
import com.etu.bookcrossing.database.entity.UserEntity

@Database(version = 1, exportSchema = false, entities = [BookEntity::class, UserEntity::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun books(): BookDao

    abstract fun users(): UserDao

}