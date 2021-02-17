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

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        PlaceAdapter adapter = new PlaceAdapter(culturals);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


        return rootView;
    }
}