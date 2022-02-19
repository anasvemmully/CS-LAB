package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

    EditText editText;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Integer num = Integer.parseInt(editText.getText().toString());
                Integer answer;
                StringBuffer r = new StringBuffer();
                for(Integer i=1;i<=10;i++){
                    answer = i*num;
                    r.append(i+" X "+num+" = "+answer).append("\n");
                }
                result.setText(r.toString());
            }
        });

    }





}