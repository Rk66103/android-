package com.codewithrohit.sharedprefrencesdemo;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name, age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= (EditText)findViewById(R.id.edit1);
        age=(EditText)findViewById(R.id.edit2);
    }

    @Override
    protected void onResume() {           // (Step---2) this is ued to load the data .
        super.onResume();

        SharedPreferences sh1= getSharedPreferences("MyOwnShared",MODE_PRIVATE);  // name should be same as we given in on pause name.
        String s1= sh1.getString("user","");
        int a1= sh1.getInt("age",0);
        name.setText(s1);
        age.setText(String.valueOf(a1));
    }

    @Override
    protected void onPause() {         // (Step---1)    this is used to Save the data.
        super.onPause();
        SharedPreferences sh= getSharedPreferences("MyOwnShared",MODE_PRIVATE);
        SharedPreferences.Editor myEdiot = sh.edit();
        myEdiot.putString("user",name.getText().toString());    // user is "Key", and name is "value", value is taken from line 16.
        myEdiot.putInt("age",Integer.parseInt(age.getText().toString()));     // user is "Key", and name is "value", value is taken from line 17.
        myEdiot.apply();    // apply() is used to begins these all above commands.


    }
}