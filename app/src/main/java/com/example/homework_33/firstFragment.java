package com.example.homework_33;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class firstFragment extends Fragment {
 private RecyclerView rvAnimal;
 private ArrayList<String> AnimalList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
rvAnimal = requireActivity().findViewById(R.id.rv_animals);
loadData();
AnimalAdapter animalAdapter = new AnimalAdapter(AnimalList);
rvAnimal.setAdapter(animalAdapter);



    }
    private  void loadData(){
        AnimalList.add("Собака");
        AnimalList.add("Кошка");
        AnimalList.add("Белка");
        AnimalList.add("Тигр");
        AnimalList.add("Пантера");
        AnimalList.add("Лев");
        AnimalList.add("Слон");
        AnimalList.add("Кенгуру");
        AnimalList.add("Акула");
        AnimalList.add("Леопард");
        AnimalList.add("Жираф");
        AnimalList.add("Обезьяна");
    }
}