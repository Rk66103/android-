package com.codewithrohit.mynewalarm;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class StandUp extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationManagerCompat myManager= NotificationManagerCompat.from(context);


        NotificationCompat.Builder myNoti = new NotificationCompat.Builder(context);

        myNoti.setContentTitle("Stand up Notification");
        myNoti.setContentText("You Need to Stand Up");
        myNoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);


         Intent i1 = new Intent (context, StandupA.class);
         PendingIntent pd= PendingIntent.getActivity(context,1,i1,0);

         myNoti.setContentIntent(pd);

         myNoti.setAutoCancel(true);

         myManager.notify(1, myNoti.build());




    }
}