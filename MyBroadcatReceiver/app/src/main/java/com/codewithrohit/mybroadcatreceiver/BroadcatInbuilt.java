package com.codewithrohit.mybroadcatreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcatInbuilt extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Battery is Low please charge", Toast.LENGTH_SHORT).show();

    }
}