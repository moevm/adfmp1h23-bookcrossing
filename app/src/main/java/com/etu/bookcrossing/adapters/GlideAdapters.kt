package com.etu.bookcrossing.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    if (imageUrl.isNullOrEmpty()) {
        return
    }
    Glide.with(view)
        .load(imageUrl)
        .into(view)
}