package com.codewithrohit.applifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"on create finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy finished" ,Toast.LENGTH_SHORT).show();
        Log.i("MainActivity" , "onDestroy");
    }
}

