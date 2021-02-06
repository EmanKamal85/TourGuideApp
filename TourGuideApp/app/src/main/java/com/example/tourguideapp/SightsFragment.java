package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class SightsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> sights = new ArrayList<Place>();
        sights.add(new Place(getString(R.string.sights0_name), getString(R.string.sights0_overview), getString(R.string.sights0_location), R.drawable.bibleothecaalexandrina));
        sights.add(new Place(getString(R.string.sights1_name), getString(R.string.sights1_overview), getString(R.string.sights1_location), R.drawable.catacomb));
        sights.add(new Place(getString(R.string.sights2_name), getString(R.string.sights2_overview), getString(R.string.sights2_location), R.drawable.fortqayetbey2));
        sights.add(new Place(getString(R.string.sights3_name), getString(R.string.sights3_overview), getString(R.string.sights3_location), R.drawable.royal_jewelary_meuseum));

        PlaceAdapter mAdapter = new PlaceAdapter(getContext(), sights);
        ListView placeList = (ListView) rootView.findViewById(R.id.places_list);
        placeList.setAdapter(mAdapter);

        return rootView;
    }
}