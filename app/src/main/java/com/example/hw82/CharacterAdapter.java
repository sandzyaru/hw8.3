package com.example.hw82;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw82.databinding.ItemCharacterBinding;
import com.example.hw82.databinding.ItemLocationTextBinding;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
    private ArrayList<CharacterPerson> characters;

    public CharacterAdapter(ArrayList<CharacterPerson> characterPeople) {
        characters=characterPeople;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharacterAdapter.CharacterViewHolder(ItemCharacterBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.bind(characters.get(position));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder{
        private ItemCharacterBinding binding;
        public CharacterViewHolder( @NonNull ItemCharacterBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(CharacterPerson characterPerson) {
            binding.aliveOrDead.setText(characterPerson.getAliveOrDead());
            binding.personName.setText(characterPerson.getPersonName());
            binding.person.setImageResource(characterPerson.getImage());
        }
    }
}
