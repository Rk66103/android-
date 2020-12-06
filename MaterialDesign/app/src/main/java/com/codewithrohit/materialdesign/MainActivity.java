 package com.codewithrohit.materialdesign;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void dosomthing(View view) {
         AlertDialog.Builder bu= new AlertDialog.Builder(this);

         bu.setTitle("Add");
         bu.setMessage("Data is added");


         bu.setPositiveButton("yes", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 finish();
             }
         });

         bu.setNegativeButton("NO", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int which) {
                 dialogInterface.dismiss();
             }
         });
         bu.setCancelable(false);
         bu.show();


     }

     public void Dog(View view) {
         Toast.makeText(this,"Yes",Toast.LENGTH_LONG).show();
     }
 }