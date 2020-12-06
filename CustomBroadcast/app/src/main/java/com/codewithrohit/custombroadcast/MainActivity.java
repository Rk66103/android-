package com.codewithrohit.custombroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void callCustom(View view) {

        Intent i1= new Intent();
        i1.setAction("com.merit.own.MyReceiver.call");
        i1.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i1);
    }

    public void some(View view) {
        Toast.makeText(this, "yes this is here !!!!!!!",Toast.LENGTH_SHORT).show();
    }
}