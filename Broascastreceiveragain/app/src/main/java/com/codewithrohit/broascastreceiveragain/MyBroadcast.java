package com.codewithrohit.broascastreceiveragain;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {



        Toast.makeText(context,"Power Disconnected",Toast.LENGTH_SHORT).show();



    }
}