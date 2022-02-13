package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    RadioGroup radioGroup;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup3);
        result = findViewById(R.id.result);
    }

    public void isChecked(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        switch (radioId){
            case R.id.male:
                result.setText("You selected  :" + radioButton.getText());
            case R.id.female:
                result.setText("You selected  :" + radioButton.getText());
        }
    }


}