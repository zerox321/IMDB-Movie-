package com.eramint.movieapp.ui.fragmentPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eramint.movieapp.R

import com.eramint.movieapp.databinding.FragmentContainerBinding

class ContainerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentContainerBinding.inflate(layoutInflater)
        initViewModel(binding)
        return binding.root
    }


    private fun initViewModel(
        binding: FragmentContainerBinding
    ) {
        binding.lifecycleOwner = this
        val viewModel = ContainerViewModel(childFragmentManager,
            getString(R.string.popular),
            getString(R.string.popular_Tag),
            getString(R.string.topRated),
            getString(R.string.topRated_Tag)
            )
        binding.viewModel = viewModel
    }

}