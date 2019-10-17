// Generated by data binding compiler. Do not edit!
package com.eramint.movieapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.eramint.movieapp.R;
import com.eramint.movieapp.ui.movieList.MovieListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieListFragmentBinding extends ViewDataBinding {
  @Bindable
  protected MovieListViewModel mViewModel;

  protected MovieListFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable MovieListViewModel viewModel);

  @Nullable
  public MovieListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static MovieListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieListFragmentBinding>inflateInternal(inflater, R.layout.movie_list_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MovieListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieListFragmentBinding>inflateInternal(inflater, R.layout.movie_list_fragment, null, false, component);
  }

  public static MovieListFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MovieListFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (MovieListFragmentBinding)bind(component, view, R.layout.movie_list_fragment);
  }
}
