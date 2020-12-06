package com.codewithrohit.tabswipeagain;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

TabLayout Layout;
ViewPager Pager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Layout= (TabLayout)findViewById(R.id.myTab);
        Pager =(ViewPager)findViewById(R.id.myView);

        Pager.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
        Layout.setupWithViewPager(Pager);

        Layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter{





        String data[] = {"Class", "Copy", "Pencil"};

        public MyOwnPagerAdapter(FragmentManager fm) {


            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i==0){
                return new Class();
            }
            if(i==1){
                return new Copy();
            }
            if(i==2){
                return new pensil();
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







