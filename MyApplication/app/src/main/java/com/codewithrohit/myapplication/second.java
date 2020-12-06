package com.codewithrohit.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void somthing(View view) {

        Toast.makeText(this, "this is Map", Toast.LENGTH_SHORT).show();
        Intent i1= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i1);
    }
}
