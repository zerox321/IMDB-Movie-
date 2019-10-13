package com.eramint.movieapp.ui.topRated;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/eramint/movieapp/ui/topRated/TopRatedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/eramint/movieapp/adpater/MovieAdapter$ClickListener;", "()V", "adapter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eramint/movieapp/adpater/MovieAdapter;", "getAdapter", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "repository", "Lcom/eramint/movieapp/ui/topRated/TopRatedRepository;", "tag", "", "onRefresh", "", "onRowClick", "MovieItem", "Lcom/eramint/movieapp/model/MovieItem;", "app_debug"})
public final class TopRatedViewModel extends androidx.lifecycle.ViewModel implements com.eramint.movieapp.adpater.MovieAdapter.ClickListener {
    private final java.lang.String tag = "TopRatedViewModel :  ";
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter> adapter = null;
    private final com.eramint.movieapp.ui.topRated.TopRatedRepository repository = null;
    
    @java.lang.Override()
    public void onRowClick(@org.jetbrains.annotations.NotNull()
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
    
    public TopRatedViewModel() {
        super();
    }
}