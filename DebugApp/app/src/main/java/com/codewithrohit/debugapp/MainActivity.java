package com.codewithrohit.debugapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1 ,e2;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText)findViewById(R.id.edit1);
        e2=(EditText)findViewById(R.id.edit2);
        tv1= (TextView)findViewById(R.id.myresult);
    }

    public void doadd(View view) {
        Log.i("MainActivity", "Executed 1");  // ye hmne isiliye likha kyki pehle execute hone ke baad app crash ho rhi thi.
        int a1= Integer.parseInt(e1.getText().toString());
        Log.i("MainActivity", "Executed 2");   // ye hmne isiliye likha kyki pehle execute hone ke baad app crash ho rhi thi.
        int a2= Integer.parseInt(e2.getText().toString());
        Log.i("MainActivity", "Executed 3"); // ye hmne isiliye likha kyki pehle execute hone ke baad app crash ho rhi thi.
        int result = a1*a2;
        Log.i("MainActivity", "Executed 4");  // ye hmne isiliye likha kyki pehle execute hone ke baad app crash ho rhi thi.
        tv1.setText(" "+result);    // "" ye hmne string ki probem dur krne ke liye lagay hai.
        Log.i("MainActivity", "Executed 5");
        // ye hmne isiliye likha kyki pehle execute hone ke baad app crash ho rhi thi.

        }
    }
