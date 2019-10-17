package com.eramint.movieapp.adpater

import androidx.databinding.BindingAdapter

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.eramint.movieapp.HomeActivity


@BindingAdapter("image")
fun setImage(imageView: ImageView, url: String) {
    Glide.with(imageView.context)
        .load("https://image.tmdb.org/t/p/w500$url")
        .diskCacheStrategy(DiskCacheStrategy.DATA)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(imageView)
}
