package com.example.hw82.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw82.CharacterAdapter;
import com.example.hw82.CharacterPerson;
import com.example.hw82.OnClick;
import com.example.hw82.R;
import com.example.hw82.databinding.FragmentCharacterBinding;

import java.util.ArrayList;


public class CharacterFragment extends Fragment implements OnClick {
    private FragmentCharacterBinding binding;
    private ArrayList<CharacterPerson> characterPeople;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentCharacterBinding.inflate(LayoutInflater.from(requireContext()),container,false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        CharacterAdapter adapter= new CharacterAdapter(characterPeople,this::onClick);
        binding.recyclerCharacter.setAdapter(adapter);


    }

    private void LoadData() {
        characterPeople=new ArrayList<>();
        characterPeople.add(new CharacterPerson(R.drawable.ic_rick,"Alive","Rick Sanchez"));
        characterPeople.add(new CharacterPerson(R.drawable.ic_morty,"Alive","Morty Smith"));
        characterPeople.add(new CharacterPerson(R.drawable.ic_albert,"Dead","Albert Einstein"));
        characterPeople.add(new CharacterPerson(R.drawable.ic_jerry,"Alive","Jerry Smith"));
    }

    @Override
    public void onClick(CharacterPerson characterPerson) {
        @NonNull NavDirections action=CharacterFragmentDirections.actionCharacterToDetailsFragment(characterPerson);
        NavHostFragment.findNavController(CharacterFragment.this).navigate(action);
    }
}