package com.codewithrohit.light;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.TorchCallback;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch aswitch;
    TextView tv;
    CameraManager Cm;
    String CameraId;
    String result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aswitch= (Switch)findViewById(R.id.switch1);
        tv= (TextView)findViewById(R.id.tv1);

        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                torch(isChecked);
            }
        });
    }

    private void torch(boolean isChecked) {


            Cm = (CameraManager) getSystemService(CAMERA_SERVICE);
            CameraManager.set


        }
    }