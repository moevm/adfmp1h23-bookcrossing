package com.etu.bookcrossing.compose.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.etu.bookcrossing.R

@Composable
fun About() {
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.about_column_padding)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.about_column_spaced_by)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.developers_email))
        Text(text = stringResource(id = R.string.privacy_policy))
        Text(text = stringResource(id = R.string.terms_of_service))
        Text(text = stringResource(id = R.string.site_url))
        Text(text = stringResource(id = R.string.develop_by_info))
    }
}
