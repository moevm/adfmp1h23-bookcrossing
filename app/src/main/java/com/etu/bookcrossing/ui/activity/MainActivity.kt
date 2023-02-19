package com.etu.bookcrossing.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.etu.bookcrossing.R
import dagger.hilt.android.AndroidEntryPoint
import io.github.oshai.KotlinLogging

private val logger = KotlinLogging.logger {}

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.main_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        logger.info { "onCreate()" }
    }
}