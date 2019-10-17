package com.eramint.movieapp.ui.movieList

import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.android.volley.toolbox.StringRequest
import com.eramint.movieapp.BuildConfig
import com.eramint.movieapp.HomeActivity
import com.eramint.movieapp.adpater.MovieAdapter
import com.eramint.movieapp.model.MovieItem
import com.eramint.movieapp.model.MovieResponse
import com.eramint.movieapp.volley.Volley
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.net.URLDecoder
import java.net.URLEncoder


class MovieListViewModel(private val Category:String) : ViewModel(), MovieAdapter.ClickListener {
    override fun onRowClick(v: View, MovieItem: MovieItem) {
        v.findNavController().navigate(MovieListFragmentDirections.actionPopularFragmentToDetialMovieFragment())
    }


    private val tag = "PopularViewModel :  "
    val isLoading: ObservableBoolean = ObservableBoolean()
    val adapter = MutableLiveData<MovieAdapter>()
    private var page=1

    init {
        Log.e(tag, "init")
        adapter.value = MovieAdapter(this)
        fetchTopMovies(Category)
    }


    fun onRefresh() {
        Log.e(tag, "onRefresh")
        fetchTopMovies(Category)

    }


    private fun fetchTopMovies(Category:String) {
        isLoading.set(true)
        Log.e(tag, " fetchTopMovies")
        val request = object : StringRequest(
            Method.GET,
            "${BuildConfig.base_url}movie/$Category?api_key=${HomeActivity.API_KEY()}&page=$page",
            { response ->
                try {
                    val responseObj =
                        Gson().fromJson<MovieResponse>(
                            URLDecoder.decode(URLEncoder.encode(response, "iso8859-1"), "UTF-8"),
                            object : TypeToken<MovieResponse>() {}.type
                        )
                    adapter.value!!.setAppList(responseObj.results)
                } catch (ignored: IllegalStateException) {
                } catch (ignored: JsonSyntaxException) {
                }
                isLoading.set(false)

            },
            { error ->
                Log.e(tag, " ${error.message}")
                isLoading.set(false)

            }) {


        }

        Volley.instance!!.addToRequestQueue(request)
    }

}