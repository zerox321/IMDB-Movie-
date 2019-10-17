package com.eramint.movieapp.ui.movieList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/eramint/movieapp/ui/movieList/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/eramint/movieapp/adpater/MovieAdapter$ClickListener;", "Category", "", "(Ljava/lang/String;)V", "adapter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eramint/movieapp/adpater/MovieAdapter;", "getAdapter", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "page", "", "tag", "fetchTopMovies", "", "onRefresh", "onRowClick", "v", "Landroid/view/View;", "MovieItem", "Lcom/eramint/movieapp/model/MovieItem;", "app_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel implements com.eramint.movieapp.adpater.MovieAdapter.ClickListener {
    private final java.lang.String tag = "PopularViewModel :  ";
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter> adapter = null;
    private int page;
    private final java.lang.String Category = null;
    
    @java.lang.Override()
    public void onRowClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    com.eramint.movieapp.model.MovieItem MovieItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter> getAdapter() {
        return null;
    }
    
    public final void onRefresh() {
    }
    
    private final void fetchTopMovies(java.lang.String Category) {
    }
    
    public MovieListViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String Category) {
        super();
    }
}