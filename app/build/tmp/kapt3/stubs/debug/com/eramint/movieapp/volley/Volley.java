package com.eramint.movieapp.volley;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bJ\"\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0016R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/eramint/movieapp/volley/Volley;", "Landroid/app/Application;", "()V", "requestQueue", "Lcom/android/volley/RequestQueue;", "getRequestQueue", "()Lcom/android/volley/RequestQueue;", "addToRequestQueue", "", "T", "request", "Lcom/android/volley/Request;", "tag", "", "cancelPendingRequests", "", "onCreate", "Companion", "app_debug"})
public final class Volley extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private final com.android.volley.RequestQueue requestQueue = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable()
    private static com.eramint.movieapp.volley.Volley instance;
    public static final com.eramint.movieapp.volley.Volley.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.volley.RequestQueue getRequestQueue() {
        return null;
    }
    
    public final <T extends java.lang.Object>void addToRequestQueue(@org.jetbrains.annotations.NotNull()
    com.android.volley.Request<T> request, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final <T extends java.lang.Object>void addToRequestQueue(@org.jetbrains.annotations.NotNull()
    com.android.volley.Request<T> request) {
    }
    
    public final void cancelPendingRequests(@org.jetbrains.annotations.NotNull()
    java.lang.Object tag) {
    }
    
    public Volley() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/eramint/movieapp/volley/Volley$Companion;", "", "()V", "TAG", "", "<set-?>", "Lcom/eramint/movieapp/volley/Volley;", "instance", "getInstance", "()Lcom/eramint/movieapp/volley/Volley;", "setInstance", "(Lcom/eramint/movieapp/volley/Volley;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized com.eramint.movieapp.volley.Volley getInstance() {
            return null;
        }
        
        private final void setInstance(com.eramint.movieapp.volley.Volley p0) {
        }
        
        private Companion() {
            super();
        }
    }
}