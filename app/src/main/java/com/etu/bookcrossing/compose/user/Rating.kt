package com.etu.bookcrossing.compose.user

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.RowsWithTextHeader
import com.etu.bookcrossing.compose.list.Image
import com.etu.bookcrossing.database.entity.UserEntity
import com.etu.bookcrossing.viewmodel.UsersRatingViewModel

@Composable
fun UserRatingItem(user: UserEntity) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(BorderStroke(0.25.dp, SolidColor(Color(R.color.dark_green)))),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            model = user.photoUrl,
            contentDescription = "User photo",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = user.name, fontSize = 20.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Took 0 books, returned 0 books", fontSize = 14.sp, color = Color.Gray)
        }

    }
}

@Composable
fun Rating(viewModel: UsersRatingViewModel = hiltViewModel()) {
    val rating by remember(viewModel) {
        viewModel.loadRating()
    }.collectAsState(initial = emptyList())

    RowsWithTextHeader(
        headerText = "Users Rating",
        elements = rating,
        consumer = { UserRatingItem(user = it) }
    )

}