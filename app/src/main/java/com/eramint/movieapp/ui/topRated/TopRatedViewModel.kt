package com.eramint.movieapp.ui.topRated

import android.util.Log
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eramint.movieapp.adpater.MovieAdapter
import com.eramint.movieapp.model.MovieItem


class TopRatedViewModel : ViewModel(), MovieAdapter.ClickListener {
    override fun onRowClick(MovieItem: MovieItem) {
    }

    private val tag = "TopRatedViewModel :  "
    val isLoading: ObservableBoolean = ObservableBoolean()
    val adapter = MutableLiveData<MovieAdapter>()
private val repository:TopRatedRepository = TopRatedRepository()

    init {
        Log.e(tag,"init")
        adapter.value = MovieAdapter(this)
        repository.fetchTopMovies()
    }


    fun onRefresh() {
        Log.e(tag,"onRefresh")

    }
}
