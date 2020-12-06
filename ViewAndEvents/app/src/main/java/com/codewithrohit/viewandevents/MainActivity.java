package com.codewithrohit.viewandevents;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1;
    Button b1,b2, b4, b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b4= (Button)findViewById(R.id.b4);
        b5= (Button)findViewById(R.id.b5);

        b1.setOnClickListener(this);



    }




    @Override
    public void onClick(View v) {
        t1.setText("you clicked Rohit 1");
    }

    public  void dosomthing(View v)
    {
        t1.setText("you clicked button 2");
    }

    public void jaihoo(View view) {
        t1.setText(("yes i done "));
        Toast.makeText(MainActivity.this,"Hurray",Toast.LENGTH_LONG).show();
    }


    public void change0(View view) {
        t1.setText("You have not selected any change");
    }


    public void button(View view) {
        t1.setText("Yes! You are in");
    }

    public void New(View view) {
        t1.setText("You are new, Regsiter First");
    }
}
