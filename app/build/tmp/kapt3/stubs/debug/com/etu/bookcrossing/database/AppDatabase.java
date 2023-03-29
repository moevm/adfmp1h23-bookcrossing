package com.etu.bookcrossing.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.etu.bookcrossing.database.dao.BookDao;
import com.etu.bookcrossing.database.dao.UserDao;
import com.etu.bookcrossing.database.entity.BookEntity;
import com.etu.bookcrossing.database.entity.UserEntity;

@androidx.room.Database(version = 1, exportSchema = false, entities = {com.etu.bookcrossing.database.entity.BookEntity.class, com.etu.bookcrossing.database.entity.UserEntity.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/etu/bookcrossing/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "books", "Lcom/etu/bookcrossing/database/dao/BookDao;", "users", "Lcom/etu/bookcrossing/database/dao/UserDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.etu.bookcrossing.database.dao.BookDao books();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.etu.bookcrossing.database.dao.UserDao users();
}