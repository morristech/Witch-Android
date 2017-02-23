package com.example.zipper.picasso;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import android.widget.ImageView;

import se.snylt.zipper.viewbinder.bindaction.OnBindAction;

public class PicassoOnBind implements OnBindAction<ImageView, String> {

    @Override
    public void onBind(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .into(view);
    }
}