package com.zenvia.galeria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class Galeria extends FrameLayout {

    private View mRoot;
    private RecyclerView mRecyclerView;
    
    public Galeria(Context context) {
        super(context);
        initGaleria(context);
    }

    public Galeria(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGaleria(context);
    }

    public Galeria(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initGaleria(context);
    }

    public void initGaleria(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mRoot = inflater.inflate(R.layout.galeria_layout, this, true);

        mRecyclerView = (RecyclerView) mRoot.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        List<Integer> imageIds = GaleriaConfigurator.getImageIds();

        mRecyclerView.setAdapter(new GaleriaAdapter(imageIds));

    }




}
