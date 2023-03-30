package com.etu.bookcrossing.di
import android.content.Context
import androidx.room.Room
import com.etu.bookcrossing.database.AppDatabase
import com.etu.bookcrossing.database.dao.BookDao
import com.etu.bookcrossing.database.repository.IBookRepository
import com.etu.bookcrossing.database.repository.IUserRepository
import com.etu.bookcrossing.database.repository.impl.BookRepository
import com.etu.bookcrossing.database.repository.impl.UserRepository
import com.etu.bookcrossing.worker.SeedingCallback
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
const val DATABASE_NAME = "books_db"
@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .addCallback(SeedingCallback(context))
            .build()
    }

    @Provides
    @Singleton
    fun provideBookDao(appDatabase: AppDatabase): BookDao {
        return appDatabase.books()
    }

    @Provides
    @Singleton
    fun provideBookRepository(appDatabase: AppDatabase): IBookRepository {
        return BookRepository(appDatabase.books())
    }

    @Provides
    @Singleton
    fun provideUserRepository(appDatabase: AppDatabase): IUserRepository {
        return UserRepository(appDatabase.users())
    }

}