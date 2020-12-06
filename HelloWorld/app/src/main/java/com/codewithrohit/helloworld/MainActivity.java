package com.codewithrohit.helloworld;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1;
    ToggleButton tb;
    RadioButton rb;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
          tb=(ToggleButton)findViewById(R.id.tb1);
          rb= (RadioButton)findViewById(R.id.rb1);




          rb.setOnClickListener(new View.OnClickListener()


                         @Override
                         public void onChecked?=




























        hanged(View v){
                         if (tb.isChecked()) {
                             Toast.makeText(MainActivity.this, "Button turned On", Toast.LENGTH_SHORT).show();


                         }


                     }

                     });




    public void progress(View view) {

        ProgressDialog pd = new ProgressDialog(this);

        pd.setTitle("Run");
        pd.setMessage("Wait");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "cancelll", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        pd.setCancelable(false);
        pd.show();
    }

    public void exit(View view) {

        AlertDialog.Builder ad= new AlertDialog.Builder(this);

        ad.setTitle("EXIT");
        ad.setMessage("Are you Sure");


        ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();


            }
        });

        ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
           dialogInterface.cancel();
            }
        });
        ad.setCancelable(false);
        ad.show();

    }
}}









