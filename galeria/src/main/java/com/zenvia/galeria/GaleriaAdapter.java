package com.zenvia.galeria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GaleriaAdapter extends RecyclerView.Adapter<GaleriaAdapter.ViewHolder> {
    private List<Integer> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public View layer;
        public View mRoot;

        public ViewHolder(View root) {
            super(root);
            mRoot = root;
            mImageView = (ImageView)mRoot.findViewById(R.id.image);
            layer = mRoot.findViewById(R.id.free_layer);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public GaleriaAdapter(List<Integer> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public GaleriaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_card, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mImageView.setImageResource(mDataset.get(position));
        if(!GaleriaConfigurator.getInstance().isFree())
            holder.layer.setVisibility(View.GONE);
        else
            holder.layer.setVisibility(View.VISIBLE);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}