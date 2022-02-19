package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {

    Button activity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity1 = findViewById(R.id.next);

        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAvtivity2();
            }
        });

    }

    public void openAvtivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }





}