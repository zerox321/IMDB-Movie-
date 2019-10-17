package com.eramint.movieapp.databinding;
import com.eramint.movieapp.R;
import com.eramint.movieapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieListFragmentBindingImpl extends MovieListFragmentBinding implements com.eramint.movieapp.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView1;
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private MovieListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.recyclerview.widget.RecyclerView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.eramint.movieapp.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.eramint.movieapp.ui.movieList.MovieListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.eramint.movieapp.ui.movieList.MovieListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAdapter((androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLoading((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAdapter(androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter> ViewModelAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.databinding.ObservableBoolean ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<com.eramint.movieapp.adpater.MovieAdapter> viewModelAdapter = null;
        androidx.databinding.ObservableBoolean viewModelIsLoading = null;
        boolean viewModelIsLoadingGet = false;
        com.eramint.movieapp.ui.movieList.MovieListViewModel viewModel = mViewModel;
        com.eramint.movieapp.adpater.MovieAdapter viewModelAdapterGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.adapter
                        viewModelAdapter = viewModel.getAdapter();
                    }
                    updateLiveDataRegistration(0, viewModelAdapter);


                    if (viewModelAdapter != null) {
                        // read viewModel.adapter.getValue()
                        viewModelAdapterGetValue = viewModelAdapter.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateRegistration(1, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnRefreshListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView0.setRefreshing(viewModelIsLoadingGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.eramint.movieapp.adpater.BindingAdapterKt.setAdapter(this.mboundView1, viewModelAdapterGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.eramint.movieapp.ui.movieList.MovieListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onRefresh();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.adapter
        flag 1 (0x2L): viewModel.isLoading
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}