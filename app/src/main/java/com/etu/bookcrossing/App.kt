package com.etu.bookcrossing

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.github.oshai.KotlinLogging

private val logger = KotlinLogging.logger {}

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        logger.info{"onCreate()"}
    }
}