package com.codewithrohit.newasyncinternet;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectInternetTask extends AsyncTask<String,Void,String> {

    Context ctx;

    public ConnectInternetTask(Context ct){
        ctx=ct;
    }


    @Override
    protected String doInBackground(String... strings) {
        String s1= strings[0]; // 0 isme position hai link ki jo hme MainActivity me http link diya hai uski.

        InputStream in;     // this is for to get respose back

        try {
            URL myurl= new URL(s1);

            HttpURLConnection myconn= (HttpURLConnection) myurl.openConnection();
            myconn.setReadTimeout(10000);
            myconn.setConnectTimeout(20000);
            myconn.setRequestMethod("get");
            myconn.connect();



            in= myconn.getInputStream();

            BufferedReader mybuf= new BufferedReader(new InputStreamReader(in));
            StringBuilder st= new StringBuilder();
            String line=""; // it will hold the string line.


            while ((line=mybuf.readLine()) != null){

                st.append(line+"    /n");


                mybuf.close();
                in.close();

                return st.toString();

            }



        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }


    @Override
    protected void onPostExecute(String s) {

        MainActivity.myText.setText(s);

    }
}
