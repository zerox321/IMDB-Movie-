package com.eramint.movieapp.generated.callback;
public final class OnRefreshListener implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    final Listener mListener;
    final int mSourceId;
    public OnRefreshListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onRefresh() {
        mListener._internalCallbackOnRefresh(mSourceId );
    }
    public interface Listener {
        void _internalCallbackOnRefresh(int sourceId );
    }
}