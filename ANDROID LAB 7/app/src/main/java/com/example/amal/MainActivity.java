package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {

    CheckBox ch1,ch2,ch3,ch4;
    TextView result;

    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);

        result = findViewById(R.id.result);
        arrayList = new ArrayList<>();
    }

     public void itemCheck(View view){

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.checkBox1:
                if (checked){
                    arrayList.add(ch1.getText().toString());
                }else{
                    arrayList.remove(ch1.getText().toString());
                }
                break;
            case R.id.checkBox2:
                if (checked){
                    arrayList.add(ch2.getText().toString());
                }else{
                    arrayList.remove(ch2.getText().toString());
                }
                break;
            case R.id.checkBox3:
                if (checked){
                    arrayList.add(ch3.getText().toString());
                }else{
                    arrayList.remove(ch3.getText().toString());
                }
                break;
            case R.id.checkBox4:
                if (checked){
                    arrayList.add(ch4.getText().toString());
                }else{
                    arrayList.remove(ch4.getText().toString());
                }
                break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : arrayList){
            stringBuilder.append(s).append(", ");
            Log.i("ME",s);
        }

        result.setText("You Selected : " + stringBuilder.toString());
    }


}