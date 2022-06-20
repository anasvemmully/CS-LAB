package com.example.amal;


import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        WifiManager wf = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);

        int ip = wf.getConnectionInfo().getIpAddress();
        result.setText(Formatter.formatIpAddress(ip));

    }





}