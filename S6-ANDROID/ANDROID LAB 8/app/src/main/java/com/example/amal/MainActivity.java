package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity  {

    ImageView imageView;
    Button Image1, Image2, Image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        Image1 = findViewById(R.id.button1);
        Image2 = findViewById(R.id.button2);
        Image3 = findViewById(R.id.button3);


    }

    public void setImageView(View view){
        switch (view.getId()){
            case R.id.button1:
                imageView.setBackgroundResource(R.drawable.image);
                break;
            case R.id.button2:
                imageView.setBackgroundResource(R.drawable.image2);
                break;
            case R.id.button3:
                imageView.setBackgroundResource(R.drawable.image3);
                break;
        }
    }


}