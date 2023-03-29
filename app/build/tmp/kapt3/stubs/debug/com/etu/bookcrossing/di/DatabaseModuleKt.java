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

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"DATABASE_NAME", "", "app_debug"})
public final class DatabaseModuleKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "books_db";
}