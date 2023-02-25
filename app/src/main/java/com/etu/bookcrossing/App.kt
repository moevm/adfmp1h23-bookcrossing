package com.etu.bookcrossing

import android.app.Application
import android.util.Log
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import org.slf4j.Logger
import javax.inject.Inject

@HiltAndroidApp
class App : Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: HiltWorkerFactory
    var logLevel = if (BuildConfig.DEBUG) Log.DEBUG else Log.ERROR

    override fun onCreate() {
        super.onCreate()

        System.setProperty(Logger.ROOT_LOGGER_NAME, logLevel.toString())
    }

    override fun getWorkManagerConfiguration(): Configuration =
        Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .setMinimumLoggingLevel(logLevel)
            .build()
}