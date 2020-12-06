package com.codewithrohit.br0;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myReceiver = new MyReceiver();

        registerReceiver(myReceiver, new IntentFilter("My_MSG"));



    }

    public void somthing(View view) {
        sendBroadcast(new Intent("My_MSG"));
    }
}