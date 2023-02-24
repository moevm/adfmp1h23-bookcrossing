package com.etu.bookcrossing

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.github.oshai.KotlinLogging

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}