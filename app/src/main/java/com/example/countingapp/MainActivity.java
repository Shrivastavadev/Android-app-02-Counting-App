package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter_txt, appname;
    Button count_plus, count_minus, reset;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter_txt = findViewById(R.id.counter_txt);
        appname = findViewById(R.id.appname);
        count_minus =findViewById(R.id.count_minus);
        count_plus = findViewById(R.id.count_plus);
        reset = findViewById(R.id.reset);

        // Adding the functionalities
        // 1. Adding the count plus functionalities
        count_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_txt.setText(""+ increaseCounter()); // Its a good practice to use empty string before adding number idk why?
            }
        });
        count_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_txt.setText(""+ decreaseCounter());
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_txt.setText(""+resetCounter());
            }
        });

    }
    // java functions for increasing, decreasing or reseting counter
    // These are added outside the oncreate function
    // 1. Increasing
    public int increaseCounter(){
        return ++counter;
        // ++x = first add one to x then store it, x++ just add one to x and then show so increments after loop ends
    }
    // 2. Decreasing
    public int decreaseCounter(){
        return --counter;
    }
    //3. resetting
    public int resetCounter(){
        counter = 0;
        return counter;
    }
}