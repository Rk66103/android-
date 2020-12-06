package com.codewithrohit.mybroadcatreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callinbuilt(View view) {

    }

    public void callcustom(View view) {
        Intent i1= new Intent();
        i1.setAction("com.myrohit.own.MyReceiver.call");
        i1.addCategory("android.intent.category.DEFAULT");


        sendBroadcast(i1);


    }
}