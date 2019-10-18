package com.eramint.movieapp.ui.movieList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eramint.movieapp.R
import com.eramint.movieapp.databinding.MovieListFragmentBinding


class MovieListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MovieListFragmentBinding.inflate(layoutInflater)
        val tag: String? = arguments!!.getString("TAG")
        initViewModel(binding,tag!!)
        return binding.root
    }


    private fun initViewModel(
        binding: MovieListFragmentBinding,
        tag:String
    ) {
        binding.lifecycleOwner = this
        val viewModel = MovieListViewModel(tag)
        binding.viewModel = viewModel
    }

}

