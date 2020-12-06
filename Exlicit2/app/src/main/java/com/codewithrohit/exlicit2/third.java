package com.codewithrohit.exlicit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

public void somthing3(View View){

        Intent i3= new Intent(this, fourth.class);
        startActivity(i3);
}


}

