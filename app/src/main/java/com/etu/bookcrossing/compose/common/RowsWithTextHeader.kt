package com.etu.bookcrossing.compose.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.etu.bookcrossing.R

@Composable
fun <T> RowsWithTextHeader(
    headerText: String,
    elements: List<T>,
    consumer: @Composable (T) -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.align(Alignment.TopStart),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CursiveBigText(
                text = headerText,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_normal))
            )

            elements.forEach { consumer(it) }
        }
    }
}