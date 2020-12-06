package com.codewithrohit.newasyncinternet;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConnectInternetTask c1;
   static TextView myText;

    static ImageView myimage;

    ConnectivityManager myConnManager;
    NetworkInfo myInfo;
    DownloadImageTask downloadimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText= (TextView)findViewById(R.id.tv1);
        myimage=(ImageView)findViewById(R.id.Myimage);

        myConnManager = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        myInfo = myConnManager.getActiveNetworkInfo();
    }

    public void dosomthingg(View view) {
        c1= new ConnectInternetTask(this);
        c1.execute("http://www.google.com");

    }

    public void downoadimage(View view) {
        if(myInfo != null && myInfo.isConnected()){
            downloadimage = new DownloadImageTask();
            downloadimage.execute("https://www.google.com/search?q=android+cool+images&rlz=1C1CHZL_enIN907IN907&sxsrf=ALeKk00iBYAho6qRUb4PUZBlntfpf6HOww:1604475227516&tbm=isch&source=iu&ictx=1&fir=QM4Bp48_uUF2FM%252CgdBUdHAnEq-2LM%252C_&vet=1&usg=AI4_-kQBGLcozzkI6B12uRljHLjiYon_Tg&sa=X&ved=2ahUKEwjHpvL_r-jsAhW763MBHQlLD8QQ9QF6BAgDED8&biw=1536&bih=754#imgrc=FJtwuY-Xt9NdZM");


        }
       else {
            Toast.makeText(MainActivity.this, "you are not connected to internet", Toast.LENGTH_SHORT).show();

        }
    }
}