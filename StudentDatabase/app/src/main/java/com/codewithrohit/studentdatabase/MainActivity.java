package com.codewithrohit.studentdatabase;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName, editSurname,editMarks , editUpdate;
    Button editButton, btnViewAll, btnUpdate , btnDelete;

    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName=(EditText)findViewById(R.id.edit1);
        editSurname= (EditText)findViewById(R.id.edit2);
        editMarks= (EditText)findViewById(R.id.edit3);
        editButton=(Button)findViewById(R.id.add);
        btnViewAll=(Button)findViewById(R.id.view);
        editUpdate=(EditText)findViewById(R.id.edit4);
        btnUpdate= (Button)findViewById(R.id.update);
        btnDelete =(Button)findViewById(R.id.delete);

        myDb = new DataBaseHelper(this);

        addData();
        viewAll();
        upDateData();
        deleteDataa();


    }

    public void addData(){
        editButton.setOnClickListener(new View.OnClickListener()
         {
            @Override
            public void onClick(View v) {
                boolean isInserted= myDb.insertData(editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());

                if(isInserted == true){
                    Toast.makeText(MainActivity.this,"Data is Successfully Inserted",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Data is not Inserted",Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    public void viewAll(){
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Cursor res= myDb.getAllData();
               if(res.getCount()==0){

                   showMessage("Error", "Nothing Found");
                   return;


               }
               else{

              StringBuffer buffer = new StringBuffer();
               while(res.moveToNext()){

                   buffer.append("ID:" + res.getString(0)+ " \n ");
                   buffer.append("NAME:" + res.getString(1)+ " \n ");
                   buffer.append("SURNAME:" + res.getString(2)+ " \n ");
                   buffer.append("MARKS:" + res.getString(3)+ " \n\n ");

                   showMessage("Data", buffer.toString());
}
               }


            }
        });
    }

    public void showMessage(String title, String Message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();


        }

        public void upDateData(){

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isuUdated = myDb.updateData(editUpdate.getText().toString(),editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());

            if(isuUdated==true){
                Toast.makeText(MainActivity.this,"Data updated",Toast.LENGTH_SHORT).show();


            }
            else {
                Toast.makeText(MainActivity.this,"Data is not updated",Toast.LENGTH_SHORT).show();
            }
            }
        });
        }


        public void deleteDataa(){

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deletedRows= myDb.deleteData(editUpdate.getText().toString());

                if(deletedRows>0){
                    Toast.makeText(MainActivity.this,"Data Deleted", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Please Give Id for delete Data",Toast.LENGTH_SHORT).show();
                }
            }
        });
        }




    }



