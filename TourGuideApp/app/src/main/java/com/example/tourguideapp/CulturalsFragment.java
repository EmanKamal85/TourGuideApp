package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class CulturalsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> culturals = new ArrayList<Place>();
        culturals.add(new Place(getString(R.string.cultural0_name), getString(R.string.cultural0_overview), getString(R.string.cultural0_location)));
        culturals.add(new Place(getString(R.string.cultural1_name), getString(R.string.cultural1_overview), getString(R.string.cultural1_location)));
        culturals.add(new Place(getString(R.string.cultural2_name), getString(R.string.cultural2_overview), getString(R.string.cultural2_location)));

        PlaceAdapter mAdapter = new PlaceAdapter(getActivity(), culturals);
        ListView placeList = (ListView) rootView.findViewById(R.id.places_list);
        placeList.setAdapter(mAdapter);


        return rootView;
    }
}