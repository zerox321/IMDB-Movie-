package com.eramint.movieapp.ui.fragmentPager


import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import com.eramint.movieapp.adpater.ViewPagerAdapter
import com.eramint.movieapp.ui.movieList.MovieListFragment


class ContainerViewModel(
    private val childFragmentManager: FragmentManager,
    private  val popular: String,
    private  val popularTag: String,
    private  val topRated: String,
    private val topRatedTag: String ) : ViewModel() {
    val adapter = ViewPagerAdapter(childFragmentManager)

    init {
        createViewPager()
    }

    private fun createViewPager() {
        val popularFragment=MovieListFragment()
        val popularArgs = Bundle()
        popularArgs.putString("TAG", popularTag)
        popularFragment.arguments = popularArgs
        adapter.addFrag(popularFragment, popular)

        val topRatedFragment=MovieListFragment()
        val topRatedArgs = Bundle()
        topRatedArgs.putString("TAG", topRatedTag)
        topRatedFragment.arguments = topRatedArgs
        adapter.addFrag(topRatedFragment, topRated)
    }
}
