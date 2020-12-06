package com.codewithrohit.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {




    RecyclerView rr;

    String s1[],s2[];
    int imageResource[] = {R.drawable.cat_icon,R.drawable.elephant_icon,R.drawable.cat_icon,R.drawable.elephant_icon,R.drawable.cat_icon,R.drawable.elephant_icon,R.drawable.cat_icon,R.drawable.elephant_icon,R.drawable.elephant_icon,R.drawable.elephant_icon,R.drawable.elephant_icon,R.drawable.elephant_icon,R.drawable.elephant_icon,};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rr= (RecyclerView)findViewById(R.id.r1);


        s1= getResources().getStringArray(R.array.pet_name);
        s2= getResources().getStringArray(R.array.dis_crip);

        ad= new MyOwnAdapter(this, s1,s2,imageResource);

        rr.setAdapter(ad);
        rr.setLayoutManager(new LinearLayoutManager(this));

    }
}