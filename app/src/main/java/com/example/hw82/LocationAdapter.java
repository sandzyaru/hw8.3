package com.example.hw82;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw82.databinding.ItemLocationTextBinding;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {
    private ArrayList<LocationDetails> locationDetails;

    public LocationAdapter(ArrayList<LocationDetails> locationDetails) {
        this.locationDetails=locationDetails;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LocationViewHolder(ItemLocationTextBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.bind(locationDetails.get(position));
    }

    @Override
    public int getItemCount() {
        return locationDetails.size();
    }

    public class LocationViewHolder extends RecyclerView.ViewHolder {
        private ItemLocationTextBinding binding;
        public LocationViewHolder(@NonNull ItemLocationTextBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;

        }

        public void bind(LocationDetails locationDetails) {
            binding.topic.setText(locationDetails.getTopic());
            binding.text.setText(locationDetails.getText());
        }
    }
}
