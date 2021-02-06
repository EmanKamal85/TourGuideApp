package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ReligiousFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> religious = new ArrayList<Place>();
        religious.add(new Place(getString(R.string.religious0_name), getString(R.string.religious0_overview), getString(R.string.religious0_location)));
        religious.add(new Place(getString(R.string.religious1_name), getString(R.string.religious1_overview), getString(R.string.religious1_location)));
        religious.add(new Place(getString(R.string.religious2_name), getString(R.string.religious2_overview), getString(R.string.religious2_location)));
        religious.add(new Place(getString(R.string.religious3_name), getString(R.string.religious3_overview), getString(R.string.religious3_location)));

        PlaceAdapter mAdapter = new PlaceAdapter(getActivity(), religious);
        ListView placeList = (ListView) rootView.findViewById(R.id.places_list);
        placeList.setAdapter(mAdapter);


        return rootView;
    }
}