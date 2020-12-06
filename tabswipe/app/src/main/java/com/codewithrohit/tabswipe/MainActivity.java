package com.codewithrohit.tabswipe;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    TabLayout mytab;  // tablayout me hme java , android, ios dikhega
    ViewPager mypage;   // ye ik new activity ki trh hogi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mytab = (TabLayout)findViewById(R.id.mytab);
        mypage = (ViewPager)findViewById(R.id.mypager);

        mypage.setAdapter(new MyOwnpagerAdapter(getSupportFragmentManager()));  // fragment pages ko my page se link karvane hetu.
        mytab.setupWithViewPager(mypage);    // my tab ko my page se link karvane hetu.

        mytab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {  // my tab me kon sa tab select krna chhate hai.
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mypage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }



    class MyOwnpagerAdapter extends FragmentPagerAdapter {     // jo hmne fragmnet bnaya hai use pager adapter ke sath link krne ke liye.

        String data[] = {"java","Android","ios"};       // jo hme hmaree tab layout me show krvana hai.

        public MyOwnpagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {    // fragment me kon sa fragment select krna hai.

            if(position ==0){
                return new java();
            }
            if(position==1){
                return new Android();
            }
            if(position==2){
                return new ios();
            }
            return null;
        }

        @Override
        public int getCount() {      // hamre fragment data li length kitni hai.


            return data.length;     // it covers all length.
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }


}







