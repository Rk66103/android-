package com.codewithrohit.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ResourceBundle;

public class second extends AppCompatActivity {
TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1=(TextView) findViewById(R.id.result);

        txt2=(TextView) findViewById(R.id.result2);
        txt3= (TextView)findViewById(R.id.result3);
        Bundle b1=getIntent().getExtras();

        String s1= b1.getString("user");
        String s2= b1.getString("user2");
        
        txt1.setText(s1);
        txt2.setText(s2);
        txt3.setText("s3");
    }
}
