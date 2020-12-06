package com.codewithrohit.menue;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;


import android.view.ContextMenu;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2;     // plain text ko initalize krvane ke liye.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.edit1);     // jo uper initalize krvaya hai use use krne ke liye.
        e2= (EditText) findViewById(R.id.edit2);    // jo uper initalize krvaya hai use use krne ke liye.

      registerForContextMenu(e1);   // this is very crutial step. context menu me e1 ko register krvane ke liye.
        registerForContextMenu(e2);     // context menu ka mtlb hai kii jab hum edit text pr long press krege to wo hme kuch menus dega.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {                  // option menu ko initalize krvane ke liye.
        getMenuInflater().inflate(R.menu.option_menu, menu);  // inflater ka mtlb hai option menu ko mainactivity se link krvane ke liye.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {                 // jo option ke andr items hai unhe initalize krvane ke liye.
        switch (item.getItemId()){                                        //switch ka matlb hai ik hi method me alag alag case use krvane ke liye.
            case  R.id.m1:
                Toast.makeText(MainActivity.this,"i am you", Toast.LENGTH_SHORT).show();


                break;

            case R.id.m2:
                Toast.makeText(MainActivity.this,"i am here",Toast.LENGTH_SHORT).show();
                 break;
            case R.id.m3:
                Toast.makeText(MainActivity.this,"i am where",Toast.LENGTH_SHORT).show();
                break;

            case R.id.c1:

                break;
        }
        return true;
    }

    public void some(MenuItem item) {
        Intent i1= new Intent(this, second.class);
     startActivity(i1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch (v.getId()){

            case R.id.edit1:
                getMenuInflater().inflate(R.menu.edit1_menu, menu);
                break;

            case R.id.edit2:
                getMenuInflater().inflate(R.menu.edit2_menu, menu);
                break;
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.i1:
                Toast.makeText(this,"item 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.i2:
                Toast.makeText(this,"item2",Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}





