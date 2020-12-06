package data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import model.contacts;
import params.params;

public class MyDbHandler  extends SQLiteOpenHelper {

    // make constructor its super contanins all variables.

    public MyDbHandler(Context context){
        super(context, params.TABLE_NAME,null,1);


    }

    //  create string , in the string make query which can conatins information from database.

    @Override
    public void onCreate(SQLiteDatabase db) {

        String create= "CREATE TABLE" + params.DB_NAME+ "(" +params.KEY_ID+ "INTEGER PRIMARY KEY,"
                +params.KEY_NAME+ "TEXT," +params.KEY_PHONE+ "TEXT," + ")";

        Log.d("deposit","Query being run is"+ create);
        db.execSQL(create);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // add contacts methods so that we can insert our  variales and values in Database.

    public void addContact(contacts contact ){       // ("contacts" class ka name hai. contact object bn gya jise hum use krege.)



        SQLiteDatabase db= this.getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put(params.KEY_NAME,contact.getName());
        values.put(params.KEY_PHONE, contact.getPhoneNumber());

        db.insert(params.TABLE_NAME,null,values);
        Log.d("deposit","Successfully inserted");
        db.close();


    }
}
