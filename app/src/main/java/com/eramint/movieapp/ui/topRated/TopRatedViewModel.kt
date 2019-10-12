package com.eramint.movieapp.ui.topRated

import android.util.Log
import androidx.lifecycle.ViewModel
import com.android.volley.toolbox.StringRequest
import com.eramint.movieapp.HomeActivity
import com.eramint.movieapp.model.MovieResponse
import com.eramint.movieapp.volley.Volley
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.net.URLDecoder
import java.net.URLEncoder

class TopRatedViewModel : ViewModel() {
    private val tag = "TopRatedViewModel :  "

    init {
        fetchTopMovies()
    }

    private fun fetchTopMovies() {

        val request = object : StringRequest(
            Method.GET, "https://api.themoviedb.org/3/movie/top_rated?api_key=${HomeActivity.API_KEY()}",
            { response ->
                parseResponse(
                    URLDecoder.decode(URLEncoder.encode(response, "iso8859-1"), "UTF-8")
                )
            }, { error ->
                Log.e(tag, " ${error.message}")
            }) {


        }

        Volley.instance!!.addToRequestQueue(request)

    }

    private fun parseResponse(response: String) {
        Log.e(tag, " $response")
        try {
            val responseObj =
                Gson().fromJson<MovieResponse>(
                    response,
                    object : TypeToken<MovieResponse>() {}.type
                )


        } catch (ignored: IllegalStateException) {
        } catch (ignored: JsonSyntaxException) {
        }

    }
}
