package com.eramint.movieapp.adpater;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001e\u0010\u0013\u001a\u00020\f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/eramint/movieapp/adpater/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/eramint/movieapp/adpater/MovieAdapter$ClickListener;", "(Lcom/eramint/movieapp/adpater/MovieAdapter$ClickListener;)V", "list", "Ljava/util/ArrayList;", "Lcom/eramint/movieapp/model/MovieItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAppList", "Offers", "Lkotlin/collections/ArrayList;", "ClickListener", "RecyclerHolderCatIcon", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.ArrayList<com.eramint.movieapp.model.MovieItem> list = null;
    private com.eramint.movieapp.adpater.MovieAdapter.ClickListener listener;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setAppList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eramint.movieapp.model.MovieItem> Offers) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    com.eramint.movieapp.adpater.MovieAdapter.ClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/eramint/movieapp/adpater/MovieAdapter$ClickListener;", "", "onRowClick", "", "v", "Landroid/view/View;", "MovieItem", "Lcom/eramint/movieapp/model/MovieItem;", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onRowClick(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        com.eramint.movieapp.model.MovieItem MovieItem);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/eramint/movieapp/adpater/MovieAdapter$RecyclerHolderCatIcon;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eramint/movieapp/databinding/MovieListRowBinding;", "(Lcom/eramint/movieapp/adpater/MovieAdapter;Lcom/eramint/movieapp/databinding/MovieListRowBinding;)V", "bind", "", "movie", "Lcom/eramint/movieapp/model/MovieItem;", "app_debug"})
    public final class RecyclerHolderCatIcon extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.eramint.movieapp.databinding.MovieListRowBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.eramint.movieapp.model.MovieItem movie) {
        }
        
        public RecyclerHolderCatIcon(@org.jetbrains.annotations.NotNull()
        com.eramint.movieapp.databinding.MovieListRowBinding binding) {
            super(null);
        }
    }
}