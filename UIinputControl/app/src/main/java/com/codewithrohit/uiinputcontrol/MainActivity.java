package com.codewithrohit.uiinputcontrol;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    RadioButton ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.tb);
        ch1 = (RadioButton) findViewById(R.id.male);
        ch2 = (RadioButton) findViewById(R.id.female);
        ch3 = (RadioButton) findViewById(R.id.Transgender);



        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "You Changed to male", Toast.LENGTH_SHORT).show();

            }
        });

        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "You Changed to Female", Toast.LENGTH_SHORT).show();
            }
        });

        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "You clicked Transgender", Toast.LENGTH_LONG).show();
            }
        });


        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(MainActivity.this, "You turned ON the button", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You Turned OFF the Button", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }



    public void progress(View view) {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Downloading");
        pd.setMessage("Please Wait......");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }

        });
        pd.show();

    }


    public void some(View view) {

        Toast.makeText(MainActivity.this, "You Clicked on English", Toast.LENGTH_SHORT).show();

    }

    public void some2(View view) {
        Toast.makeText(MainActivity.this, "You Clicked on Hindi", Toast.LENGTH_SHORT).show();

    }

    public void openalert(View view) {

        AlertDialog.Builder myalert = new AlertDialog.Builder(this);
        myalert.setTitle("Exit");
        myalert.setMessage("Are You Sure");

        myalert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        myalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
               dialogInterface. dismiss();
            }
        });
        myalert.setCancelable(false);
        myalert.show();
    }

    public void ExitButton(View view) {

        AlertDialog.Builder Exit= new AlertDialog.Builder(this);
        Exit.setTitle("EXIT");
        Exit.setMessage("Do you want to Exit");
        Exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                finish();

            }
        });

        Exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface. dismiss();
            }
        });
        Exit.setCancelable(false);
        Exit.show();


    }
}




