package com.eramint.movieapp.adpater

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<*>) {
    view.adapter = adapter
}


