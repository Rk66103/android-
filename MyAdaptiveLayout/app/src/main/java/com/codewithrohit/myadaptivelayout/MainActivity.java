package com.codewithrohit.myadaptivelayout;

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

    public void some(View view) {
        Intent i1= new Intent(MainActivity.this,Rohit.class);
        startActivity(i1);
    }
}