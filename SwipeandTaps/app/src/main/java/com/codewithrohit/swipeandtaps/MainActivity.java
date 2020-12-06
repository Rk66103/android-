package com.codewithrohit.swipeandtaps;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout mt1;
    ViewPager  vp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mt1= findViewById(R.id.mytab1);
        vp1= findViewById(R.id.mypager);


        vp1.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
mt1.setupWithViewPager(vp1);

mt1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        vp1.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});

    }

    static class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String[] data = {"java","Android","ios"};
        public MyOwnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if(position ==0){

                return new First();
            }
            if (position==1){

                return new Android();
            }

            if (position==2){

                return new ios();
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