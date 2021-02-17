package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        PlaceAdapter adapter = new PlaceAdapter(religious);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}