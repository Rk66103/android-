package com.codewithrohit.explicitintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.service.autofill.DateValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

TextView e1,e2;
EditText e3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (TextView)findViewById(R.id.edit1);
        e2 = (TextView)findViewById(R.id.edit2);
        e3= (EditText)findViewById((R.id.edit3));

    }

    public void dosomthing(View view) {
        Intent i1= new Intent(this,second.class);

        i1.putExtra("user", e1.getText().toString()); /* put extra me key or value pairs hote hai hai.
                                                                put extras hamre intent ke data ko save krta hai.*/
        i1.putExtra("user2",e2.getText().toString());
        i1.putExtra("5",e3.getText().toString());
        startActivity(i1);
    }
}