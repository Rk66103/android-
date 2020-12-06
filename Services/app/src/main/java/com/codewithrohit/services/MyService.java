package com.codewithrohit.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {

        Toast.makeText(this,"CREATED",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Services has created");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"STARTED",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Services has Started");


        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"DESTROYED",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Services has Destroyed");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
      return null;
    }
}