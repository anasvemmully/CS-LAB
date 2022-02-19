package com.example.amal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity  {

    Button activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        activity2 = findViewById(R.id.next2);

        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAvtivity1();
            }
        });

    }

    public void openAvtivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }





}