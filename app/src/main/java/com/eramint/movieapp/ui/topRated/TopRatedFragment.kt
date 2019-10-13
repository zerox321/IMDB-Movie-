package com.eramint.movieapp.ui.topRated

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eramint.movieapp.HomeActivity
import com.eramint.movieapp.R
import com.eramint.movieapp.databinding.TopRatedFragmentBinding

class TopRatedFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = TopRatedFragmentBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this

        initViewModel(binding)
        return binding.root
    }


    private fun initViewModel(
        binding: TopRatedFragmentBinding
    ) {
        val viewModel = ViewModelProviders.of(this).get(TopRatedViewModel::class.java)
        binding.viewModel = viewModel
    }

}
