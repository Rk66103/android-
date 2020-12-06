package com.codewithrohit.services;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void StartSomthing(View view) {

        Intent i1 =  new Intent(MainActivity.this,MyService.class);

        startService(i1);
    }

    public void StopSomthing(View view) {
        Intent i1 = new Intent(MainActivity.this,MyService.class);


        stopService(i1);
    }
}