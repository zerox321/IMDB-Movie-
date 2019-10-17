package com.eramint.movieapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.eramint.movieapp.databinding.HomeActivityBindingImpl;
import com.eramint.movieapp.databinding.MovieListFragmentBindingImpl;
import com.eramint.movieapp.databinding.MovieListRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_HOMEACTIVITY = 1;

  private static final int LAYOUT_MOVIELISTFRAGMENT = 2;

  private static final int LAYOUT_MOVIELISTROW = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eramint.movieapp.R.layout.home_activity, LAYOUT_HOMEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eramint.movieapp.R.layout.movie_list_fragment, LAYOUT_MOVIELISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.eramint.movieapp.R.layout.movie_list_row, LAYOUT_MOVIELISTROW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_HOMEACTIVITY: {
          if ("layout/home_activity_0".equals(tag)) {
            return new HomeActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIELISTFRAGMENT: {
          if ("layout/movie_list_fragment_0".equals(tag)) {
            return new MovieListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIELISTROW: {
          if ("layout/movie_list_row_0".equals(tag)) {
            return new MovieListRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_list_row is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(1, "ListItem");
      sKeys.put(0, "_all");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/home_activity_0", com.eramint.movieapp.R.layout.home_activity);
      sKeys.put("layout/movie_list_fragment_0", com.eramint.movieapp.R.layout.movie_list_fragment);
      sKeys.put("layout/movie_list_row_0", com.eramint.movieapp.R.layout.movie_list_row);
    }
  }
}
