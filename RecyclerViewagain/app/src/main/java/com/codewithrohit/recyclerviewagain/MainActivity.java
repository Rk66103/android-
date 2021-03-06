package com.codewithrohit.recyclerviewagain;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;

    String s1[],s2[];
    int imageResources[]= {R.drawable.dog_icon,R.drawable.rat_icon,R.drawable.elephant_icon,R.drawable.dog_icon,R.drawable.rat_icon,R.drawable.elephant_icon};
     MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 =(RecyclerView)findViewById(R.id.recycle);

    s1 = getResources().getStringArray(R.array.pet_name);
    s2= getResources().getStringArray(R.array.desc);

    ad = new MyOwnAdapter(this,s1,s2,imageResources);

    r1.setAdapter(ad);
    r1.setLayoutManager(new LinearLayoutManager(this));



    }
}