package com.eramint.movieapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/eramint/movieapp/util/AspectLockedImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "aspectRatio", "", "aspectRatioSource", "Lcom/eramint/movieapp/util/AspectLockedImageView$AspectRatioSource;", "onMeasure", "", "widthSpec", "", "heightSpec", "setAspectRatio", "setAspectRatioSource", "v", "Landroid/view/View;", "AspectRatioSource", "ViewAspectRatioSource", "app_debug"})
public final class AspectLockedImageView extends androidx.appcompat.widget.AppCompatImageView {
    private float aspectRatio;
    private com.eramint.movieapp.util.AspectLockedImageView.AspectRatioSource aspectRatioSource;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onMeasure(int widthSpec, int heightSpec) {
    }
    
    public final void setAspectRatioSource(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void setAspectRatioSource(@org.jetbrains.annotations.NotNull()
    com.eramint.movieapp.util.AspectLockedImageView.AspectRatioSource aspectRatioSource) {
    }
    
    public final void setAspectRatio(float aspectRatio) {
    }
    
    public AspectLockedImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AspectLockedImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/eramint/movieapp/util/AspectLockedImageView$AspectRatioSource;", "", "height", "", "getHeight", "()I", "width", "getWidth", "app_debug"})
    public static abstract interface AspectRatioSource {
        
        public abstract int getWidth();
        
        public abstract int getHeight();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/eramint/movieapp/util/AspectLockedImageView$ViewAspectRatioSource;", "Lcom/eramint/movieapp/util/AspectLockedImageView$AspectRatioSource;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "height", "", "getHeight", "()I", "width", "getWidth", "app_debug"})
    static final class ViewAspectRatioSource implements com.eramint.movieapp.util.AspectLockedImageView.AspectRatioSource {
        private android.view.View v;
        
        @java.lang.Override()
        public int getWidth() {
            return 0;
        }
        
        @java.lang.Override()
        public int getHeight() {
            return 0;
        }
        
        public ViewAspectRatioSource(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super();
        }
    }
}