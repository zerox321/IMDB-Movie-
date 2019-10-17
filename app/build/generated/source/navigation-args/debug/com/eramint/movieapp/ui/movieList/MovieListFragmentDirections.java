package com.eramint.movieapp.ui.movieList;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.eramint.movieapp.R;

public class MovieListFragmentDirections {
  private MovieListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionPopularFragmentToDetialMovieFragment() {
    return new ActionOnlyNavDirections(R.id.action_popular_fragment_to_detial_movie_fragment);
  }
}
