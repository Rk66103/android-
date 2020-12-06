package com.codewithrohit.contentprovider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list);

        fetchContacts();
    }

    private void fetchContacts() {

        ContentResolver resolver= getContentResolver();

        ArrayList<String> contacts= new ArrayList<>();



        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        String selection= null;
        String[] projection = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER};
        String[] selectionArgs = null;
        String sortOrder= null;

        Cursor cursor = resolver.query(uri,projection, null, null, null);



        while (cursor.moveToNext()){

            String name=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String num = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            contacts.add(name + "\n" + num);
        }

        ((ListView) findViewById(R.id.list)).setAdapter(new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,contacts));



    }


}