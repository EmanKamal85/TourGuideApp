package com.example.tourguideapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
//import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private ArrayList<Place> placesList;

    public PlaceAdapter(ArrayList<Place> placesList) {
        this.placesList = placesList;
    }
    @NonNull
    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.ViewHolder holder, int position) {
        Place currentPlace = placesList.get(position);
        holder.placeNameTextView.setText(currentPlace.getName());
        holder.overViewTextView.setText(currentPlace.getOverView());
        holder.locationTextView.setText(currentPlace.getLocation());
        if (currentPlace.getHasImage()) {
            holder.placeImage.setImageResource(currentPlace.getImageResourceId());
            Log.e(getClass().getName(), "onBindViewHolder: has image "+ position);
        } else {
            holder.placeImage.setVisibility(View.GONE);
            Log.e(getClass().getName(), "onBindViewHolder: no image "+ position);
        }
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView placeNameTextView;
        TextView overViewTextView;
        TextView locationTextView;
        ImageView placeImage;
        public ViewHolder(View itemView) {
            super(itemView);

// get the reference of item view's
            this.placeNameTextView = (TextView) itemView.findViewById(R.id.place_name);
            this.overViewTextView = (TextView) itemView.findViewById(R.id.overview);
            this.locationTextView = (TextView) itemView.findViewById(R.id.location);
            this.placeImage = (ImageView) itemView.findViewById(R.id.place_image);
        }
    }
}
