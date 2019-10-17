package com.eramint.movieapp.ui.movieDetail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.eramint.movieapp.R

class DetialMovieFragment : Fragment() {

    companion object {
        fun newInstance() = DetialMovieFragment()
    }

    private lateinit var viewModel: DetialMovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detial_movie_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetialMovieViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
