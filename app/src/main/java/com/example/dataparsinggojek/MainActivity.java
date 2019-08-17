package com.example.dataparsinggojek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView btnFood,btnClean,btnRide,btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFood = (ImageView) findViewById(R.id.imageButton);
        btnFood.setOnClickListener(this);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton :
                Intent food = new Intent(this, GoFoodActivity.class);
                startActivity(food);
                break;
        }
    }
}
