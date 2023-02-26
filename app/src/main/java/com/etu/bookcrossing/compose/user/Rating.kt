package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.Image
import com.etu.bookcrossing.compose.common.RowsWithTextHeader
import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.viewmodel.UsersRatingViewModel

@Composable
fun UserRatingItem(user: UserEntity) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.row_spaced_by))
    ) {
        Image(
            model = user.photoUrl,
            contentDescription = stringResource(R.string.user_photo_description),
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.list_item_image_height))
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.image_and_text_in_row_spacer)))

        Column {
            Text(
                text = user.name,
                fontSize = MaterialTheme.typography.body1.fontSize,
                color = MaterialTheme.typography.body1.color
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.text_in_column_spacer)))

            Text(
                text = "Took 0 books, returned 0 books",
                fontSize = MaterialTheme.typography.body2.fontSize,
                color = MaterialTheme.typography.body2.color
            )
        }
    }
}

@Composable
fun Rating(viewModel: UsersRatingViewModel = hiltViewModel()) {
    val rating by remember(viewModel) {
        viewModel.loadRating()
    }.collectAsState(initial = emptyList())

    RowsWithTextHeader(
        headerText = stringResource(R.string.users_rating_header),
        elements = rating,
        consumer = { UserRatingItem(user = it) }
    )
}