package com.etu.bookcrossing.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etu.bookcrossing.R
import dagger.hilt.android.AndroidEntryPoint
import io.github.oshai.KotlinLogging

private val logger = KotlinLogging.logger {}

@AndroidEntryPoint
class RegisterFragment : Fragment(R.layout.fragment_register) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        logger.info { "onCreate()" }
    }
}