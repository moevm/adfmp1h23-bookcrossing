package com.etu.bookcrossing.worker

import android.content.Context
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import io.github.oshai.KotlinLogging

private val logger = KotlinLogging.logger {}

class SeedingCallback(private val context: Context) : RoomDatabase.Callback() {
    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)

        logger.debug { "Seems like a first launch: database created, populating it" }

        WorkManager
            .getInstance(context)
            .enqueue(OneTimeWorkRequestBuilder<SeedDatabaseWorker>().build())
    }

}