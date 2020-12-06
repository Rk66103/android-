package com.codewithrohit.viewrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rr;

    String s1[],s2[];

    int imageResource[]= {R.drawable.dog_icon,R.drawable.rat_icon,R.drawable.dog_icon,R.drawable.rat_icon,R.drawable.dog_icon,R.drawable.rat_icon};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rr=(RecyclerView)findViewById(R.id.rv);

        s1 = getResources().getStringArray(R.array.pet_name);
        s2 = getResources().getStringArray(R.array.disc);

    }
}