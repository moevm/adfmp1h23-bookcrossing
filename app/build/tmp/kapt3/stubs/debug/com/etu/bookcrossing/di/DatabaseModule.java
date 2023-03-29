package com.etu.bookcrossing.di;

import android.content.Context;
import androidx.room.Room;
import com.etu.bookcrossing.database.AppDatabase;
import com.etu.bookcrossing.database.dao.BookDao;
import com.etu.bookcrossing.database.repository.IBookRepository;
import com.etu.bookcrossing.database.repository.IUserRepository;
import com.etu.bookcrossing.database.repository.impl.BookRepository;
import com.etu.bookcrossing.database.repository.impl.UserRepository;
import com.etu.bookcrossing.worker.SeedingCallback;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/etu/bookcrossing/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/etu/bookcrossing/database/AppDatabase;", "context", "Landroid/content/Context;", "provideBookDao", "Lcom/etu/bookcrossing/database/dao/BookDao;", "appDatabase", "provideBookRepository", "Lcom/etu/bookcrossing/database/repository/IBookRepository;", "provideUserRepository", "Lcom/etu/bookcrossing/database/repository/IUserRepository;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.etu.bookcrossing.database.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.etu.bookcrossing.database.dao.BookDao provideBookDao(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.etu.bookcrossing.database.repository.IBookRepository provideBookRepository(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.etu.bookcrossing.database.repository.IUserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.database.AppDatabase appDatabase) {
        return null;
    }
}