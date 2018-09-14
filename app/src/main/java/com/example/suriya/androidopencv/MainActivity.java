package com.example.suriya.androidopencv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug()) {
            Toast.makeText(this, "OpenCV loaded successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "OpenCV loaded fail", Toast.LENGTH_SHORT).show();
        }
    }
}
