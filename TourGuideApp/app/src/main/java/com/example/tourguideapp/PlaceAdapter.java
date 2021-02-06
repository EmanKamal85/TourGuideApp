package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = (Place) getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.place_name);
        placeNameTextView.setText(currentPlace.getName());

        TextView overViewTextView = listItemView.findViewById(R.id.overview);
        overViewTextView.setText(currentPlace.getOverView());

        TextView locationTextView = listItemView.findViewById(R.id.location);
        locationTextView.setText(currentPlace.getLocation());

        ImageView placeImage = listItemView.findViewById(R.id.place_image);
        if (currentPlace.getHasImage()) {
            placeImage.setImageResource(currentPlace.getImageResourceId());
        } else {
            placeImage.setVisibility(View.GONE);
        }


        return listItemView;
    }


}
