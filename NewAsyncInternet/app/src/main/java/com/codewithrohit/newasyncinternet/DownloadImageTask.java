package com.codewithrohit.newasyncinternet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImageTask extends AsyncTask<String,Void, Bitmap> {
    @Override
    protected Bitmap doInBackground(String... strings) {

        String s1= strings[0]; // 0 isme position hai link ki jo hme MainActivity me http link diya hai uski.

        InputStream in;     // this is for to get respose back

        try {
            URL myurl= new URL(s1);

            HttpURLConnection myconn= (HttpURLConnection) myurl.openConnection();
            myconn.setReadTimeout(10000);
            myconn.setConnectTimeout(20000);
            myconn.setRequestMethod("take");
            myconn.connect();

            in= myconn.getInputStream();

            Bitmap mymap= BitmapFactory.decodeStream(in);

            return mymap;

        } catch (Exception e) {
            e.printStackTrace();
        }





        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        MainActivity.myimage.setImageBitmap(bitmap);
    }
}
