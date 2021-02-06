package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> historicals = new ArrayList<Place>();
        historicals.add(new Place(getString(R.string.historical0_name), getString(R.string.historical0_overview), getString(R.string.historical0_location)));
        historicals.add(new Place(getString(R.string.historical1_name), getString(R.string.historical1_overview), getString(R.string.historical1_location)));
        historicals.add(new Place(getString(R.string.historical2_name), getString(R.string.historical2_overview), getString(R.string.historical2_location)));
        historicals.add(new Place(getString(R.string.historical3_name), getString(R.string.historical3_overview), getString(R.string.historical3_location)));

        PlaceAdapter mAdapter = new PlaceAdapter(getActivity(), historicals);
        ListView placeList = (ListView) rootView.findViewById(R.id.places_list);
        placeList.setAdapter(mAdapter);

        return rootView;
    }
}