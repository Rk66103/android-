package com.codewithrohit.mynotification;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomthing(View view) {

        NotificationManagerCompat myManager= NotificationManagerCompat.from(this);  // notification comapct gives us backward compatibility.

        NotificationCompat.Builder myNoti= new NotificationCompat.Builder(this);  // we created object.
        myNoti.setContentTitle("1 new message");
        myNoti.setContentText("How Are You");
        myNoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i1= new Intent(this, MainActivity.class);   // ye isiliye kyuki jb hum notification pr click krege to hume jis bhi class me jana hai vha hum pahuch jayege.
        PendingIntent pd= PendingIntent.getActivities(this,1, new Intent[]{i1},0);  // jb hum notification pr click krege to jo notification aayi hai hum us par pahuch jayege.
        myNoti.setContentIntent(pd);
        myNoti.setAutoCancel(true);

        myManager.notify(1,myNoti.build());
                 finish();
    }



}






