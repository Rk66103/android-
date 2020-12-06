package com.codewithrohit.allmix;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.work.Data;

public class MainActivity extends AppCompatActivity {

    ViewPager view;
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view= (ViewPager)findViewById(R.id.view);
        tab= (TabLayout)findViewById(R.id.tab);
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[]= {"Data","Links","java"};

        public MyOwnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i==0){
return new Data();
              }
            if(i==1){
             return new Links();
}
            if(i==2){

            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }

        @Override
        public int getCount() {
            return 0;
        }
    }