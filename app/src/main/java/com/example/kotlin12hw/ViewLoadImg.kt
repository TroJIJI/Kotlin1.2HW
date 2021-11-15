package com.example.kotlin12hw

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun View.loadImage(url: String) {
    Glide.with(this).load(url).into(this as ImageView)
}