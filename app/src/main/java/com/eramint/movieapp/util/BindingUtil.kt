package com.eramint.movieapp.util

import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView


    @BindingAdapter("setUpWithViewpager")
    fun setUpWithViewpager(tabLayout: TabLayout, viewPager: ViewPager) {
        viewPager.addOnAdapterChangeListener(ViewPager.OnAdapterChangeListener { viewPager, oldAdapter, newAdapter ->
            if (oldAdapter == null && newAdapter == null) {
                return@OnAdapterChangeListener
            }
            Log.i("TAG", "onAdapterChanged")
            tabLayout.setupWithViewPager(viewPager)
        })
    }

