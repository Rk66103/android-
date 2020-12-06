package com.codewithrohit.servicesagain;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"On-Create Service",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Start services ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Start Service",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Start services ");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Stop Service",Toast.LENGTH_SHORT).show();
        Log.i("MyServices","Stop services ");

    }
}