package com.codewithrohit.expresouitesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       Bundle b2= getIntent().getExtras();
       String s1=b2.getString("key1");

       tv1= (TextView) findViewById(R.id.result);


       tv1.setText(s1);

    }
}