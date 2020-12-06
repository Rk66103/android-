package com.codewithrohit.companiesdata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MyDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME= "COMPANY.DB";
    public static final String TABLE_NAME="Company_Database";
    public static final String COL_1="ID";
    public static final String COL_2="COMPANY_NAME";
    public static final String COL_3="EMPLOYER_NAME";
    public static final String COL_4="SALARY";

    public MyDataBase(Context context) {
        super(context, DB_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("Create Table "+TABLE_NAME+ "( ID INTEGER PRIMARY KEY AUTOINCREMENT, COMPANY_NAME TEXT , EMPLOYER_NAME TEXT , SALARY TEXT )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);

    }

    public boolean insertData(String COMPANY_NAME, String EMPLOYER_NAME, String SALARY ){

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_2, COMPANY_NAME);
        contentValues.put(COL_3, EMPLOYER_NAME);
        contentValues.put(COL_4, SALARY);
       long result =db.insert(TABLE_NAME,null,contentValues);

        if(result == -1){
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getAllData(){

        SQLiteDatabase db= this.getWritableDatabase();
      Cursor res =  db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return res;
    }

    public Integer deleteData(String ID){

        SQLiteDatabase db= this.getWritableDatabase();

        return db.delete(TABLE_NAME,"ID=?",new String[] {ID});
    }
}
