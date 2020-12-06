package com.codewithrohit.companiesdata;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyDataBase myDb;
    EditText  myEdit1, myEdit2, myEdit3, myEdit4;
    Button btnEdit1, BtnEdit2, BtnEdit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEdit1= (EditText)findViewById(R.id.edit1);
        myEdit2= (EditText)findViewById(R.id.edit2);
        myEdit3= (EditText)findViewById(R.id.edit3);
        myEdit4= (EditText)findViewById(R.id.edit4);
        btnEdit1=(Button)findViewById(R.id.add);
        BtnEdit2= (Button)findViewById(R.id.view);
        BtnEdit3 =(Button)findViewById(R.id.delete);






        myDb = new MyDataBase(this);

        addData();
        allData();
        dataDelete();
    }


    public void addData(){

        btnEdit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted= myDb.insertData(myEdit1.getText().toString(),myEdit2.getText().toString(),myEdit3.getText().toString());

               if(isInserted==true){
                   Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(MainActivity.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
               }

            }
        });

    }


    public void allData(){
        BtnEdit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=myDb.getAllData();

                if(res.getCount()==0){

                    showMessage("Error ","Nothing Found");

                }


                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("ID:" + res.getString(0) +"\n");
                    buffer.append("COMPANY_NAME"+res.getString(1)+ "\n");
                    buffer.append("EMPLOYER_NAME"+res.getString(2)+ "\n");
                    buffer.append("SALARY"+res.getString(3)+ "\n\n");


                }
                showMessage("Data", buffer.toString());

            }
        });
    }

    public void showMessage(String title, String Message){

        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }


    public void dataDelete(){

        BtnEdit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Integer result2= myDb.deleteData(myEdit4.getText().toString());

               if(result2>0){
                   Toast.makeText(MainActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
               }
               if(result2==0){
                   Toast.makeText(MainActivity.this, "data is not deleted", Toast.LENGTH_SHORT).show();
               }
            }
        });

    }

    }
