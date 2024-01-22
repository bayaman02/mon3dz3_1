package com.classwork.mon3dz3_1;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_food;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_food = itemView.findViewById(R.id.tv_food);
    }
    @SuppressLint("ResourceAsColor")
    public void onBind (String food){
        if (food == "Лагман"){
            tv_food.setTextColor(R.color.white);
        }
        tv_food.setText(food);
    }
}
