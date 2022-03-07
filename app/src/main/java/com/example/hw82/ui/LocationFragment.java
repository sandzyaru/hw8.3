package com.example.hw82.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw82.LocationAdapter;
import com.example.hw82.LocationDetails;
import com.example.hw82.R;
import com.example.hw82.databinding.FragmentLocationBinding;

import java.util.ArrayList;


public class LocationFragment extends Fragment {
    private FragmentLocationBinding binding;
    private ArrayList<LocationDetails> locationDetails;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentLocationBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        LocationAdapter adapter=new LocationAdapter(locationDetails);
        binding.recyclerLocation.setAdapter(adapter);
     /*   binding.bottomNavigation.findViewById(R.id.character).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LocationFragment.this).navigate(R.id.action_location_to_character);
            }
        });*/
    }

    private void LoadData() {
        locationDetails=new ArrayList<>();
        locationDetails.add(new LocationDetails("Planet","Earth (C-137)"));
        locationDetails.add(new LocationDetails("Cluster","Abadango"));
        locationDetails.add(new LocationDetails("Space station","Citadel of Ricks"));
        locationDetails.add(new LocationDetails("Planet","Worldender's lair"));
        locationDetails.add(new LocationDetails("Microverse","Anatomy Park"));
        locationDetails.add(new LocationDetails("TV","Interdimensional Cable"));
        locationDetails.add(new LocationDetails("Resort","Immortality Field Resort"));
        locationDetails.add(new LocationDetails("Planet","Post-Apocalyptic Earth"));
        locationDetails.add(new LocationDetails("Planet","Purge Planet"));
        locationDetails.add(new LocationDetails("Planet","Venzenulon 7"));
        locationDetails.add(new LocationDetails("Planet","Bepis 9"));
        locationDetails.add(new LocationDetails("Planet","Cronenberg Earth"));
        locationDetails.add(new LocationDetails("Planet","Nuptia 4"));
        locationDetails.add(new LocationDetails("Fantasy town","Giant's Town"));
        locationDetails.add(new LocationDetails("Planet","Bird World"));
        locationDetails.add(new LocationDetails("Space station","St. Gloopy Noops Hospital"));
        locationDetails.add(new LocationDetails("Planet","Earth (5-126)"));
        locationDetails.add(new LocationDetails("Dream","Mr. Goldenfold's dream"));
        locationDetails.add(new LocationDetails("Planet","Gromflom Prime"));
        locationDetails.add(new LocationDetails("Planet","Earth (Rpl. Dimension)"));
    }
}