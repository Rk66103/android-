 package com.codewithrohit.databaseharr;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;

 import data.MyDbHandler;
 import model.contacts;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// we make a new object of our MyDbHandler class.
        MyDbHandler db= new MyDbHandler(MainActivity.this);

        // Adding a contact to db.

        contacts deco = new contacts();

        deco.setPhoneNumber("7988620612");
        deco.setName("Reit");

        db.addContact(deco);




    }
}