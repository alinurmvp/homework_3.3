package com.example.homework_33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAnimalName;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimalName = itemView.findViewById(R.id.tv_animal_name);
    }
    public void onBind(String animal){
        tvAnimalName.setText(animal);
    }
}
