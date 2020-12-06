package com.codewithrohit.tabwipe3;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout mytab;
    ViewPager mypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytab = (TabLayout)findViewById(R.id.mytab);
        mypage= (ViewPager)findViewById(R.id.mypage);

       mypage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
       mytab.setupWithViewPager(mypage);
    }


    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[]= {"Rohit", "Kumar", "G", "New"};

        public MyOwnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i==0){
                return new Rohit();
            }

            if(i==1){
                return new Kumar();

            }

            if(i==2){
                return new G();
            }
            if(i==3){
                return new New();
            }

            return null;
        }

        @Override
        public int getCount() {


            return data.length;
        }


        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }


}


