package com.classwork.mon3dz3_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView rv_food;
    ArrayList<String> foodList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_food = requireActivity().findViewById(R.id.rv_food);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rv_food.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Пицца");
        foodList.add("Суши");
        foodList.add("Бешбармак");
        foodList.add("Борсок");
        foodList.add("Гамбургер");
        foodList.add("Шаурма");
        foodList.add("Ход Дог");
        foodList.add("Чизбургер");
        foodList.add("Хинкал");
        foodList.add("Пельмен");
        foodList.add("Шорпо");
        foodList.add("Чак Чак");
        foodList.add("Манты");
        foodList.add("Плов");
        foodList.add("Куурдак");
        foodList.add("Лагман");
        foodList.add("Пирожки");
        foodList.add("Хошан");
        foodList.add("Картошка");
        foodList.add("Картошка Фри");
        foodList.add("Кекс");
    }
}