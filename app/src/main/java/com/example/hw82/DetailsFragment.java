package com.example.hw82;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgument;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.hw82.databinding.FragmentDetailsBinding;


public class DetailsFragment extends Fragment {
     private FragmentDetailsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentDetailsBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CharacterPerson characterPerson=DetailsFragmentArgs.fromBundle(getArguments()).getCharacterPerson();
        binding.personDetails.setImageResource(characterPerson.getImage());
        binding.aliveOrDead.setText(characterPerson.getAliveOrDead());
        binding.personName.setText(characterPerson.getPersonName());
    }
}
