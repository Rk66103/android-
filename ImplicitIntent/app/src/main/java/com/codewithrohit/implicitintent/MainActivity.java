package com.codewithrohit.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomthing(View view) {

        switch (view.getId()){

            case R.id.b1 :
                Intent i1= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hryscbcschemes.in/StaticPages/HomePage.aspx"));
                startActivity(i1);
                break;

            case R.id.b2:
                Intent i2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:8708258048"));
                startActivity(i2);
                break;

            case  R.id.b3:
                Intent i3= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,78.9629"));
                startActivity(i3);
                break;

            case R.id.b4:
                Intent i4= new Intent(Intent.ACTION_VIEW, Uri.parse("http://ku.digitaluniversity.ac/SearchDuplicateResult.aspx?ID=859"));
                startActivity(i4);
        }
    }
}