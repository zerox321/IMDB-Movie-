package com.eramint.movieapp.databinding;
import com.eramint.movieapp.R;
import com.eramint.movieapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieListRowBindingImpl extends MovieListRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieListRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private MovieListRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[5]
            , (com.eramint.movieapp.util.AspectLockedImageView) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.movieItemImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.ListItem == variableId) {
            setListItem((com.eramint.movieapp.model.MovieItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListItem(@Nullable com.eramint.movieapp.model.MovieItem ListItem) {
        this.mListItem = ListItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ListItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.eramint.movieapp.model.MovieItem listItem = mListItem;
        java.lang.String listItemReleaseDate = null;
        java.lang.String listItemOverview = null;
        java.lang.String listItemPosterPath = null;
        java.lang.String listItemTitle = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listItem != null) {
                    // read ListItem.releaseDate
                    listItemReleaseDate = listItem.getReleaseDate();
                    // read ListItem.overview
                    listItemOverview = listItem.getOverview();
                    // read ListItem.posterPath
                    listItemPosterPath = listItem.getPosterPath();
                    // read ListItem.title
                    listItemTitle = listItem.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, listItemTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, listItemReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, listItemOverview);
            com.eramint.movieapp.adpater.ImageHelperKt.setImage(this.movieItemImage, listItemPosterPath);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ListItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}