package com.cookandroid.a5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout purple, blue,yellow,black;
    int width,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제5-6");

        purple = (LinearLayout) findViewById(R.id.purple);
        blue = (LinearLayout) findViewById(R.id.blue);
        yellow = (LinearLayout) findViewById(R.id.yellow);
        black = (LinearLayout) findViewById(R.id.black);

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = purple.getWidth();
                height = purple.getHeight();
                Toast.makeText(getApplicationContext(),"가로 : " + width + " 세로 : " + height,
                        Toast.LENGTH_SHORT).show();
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = blue.getWidth();
                height = blue.getHeight();
                Toast.makeText(getApplicationContext(),"가로 : " + width + " 세로 : " + height,
                        Toast.LENGTH_SHORT).show();
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = yellow.getWidth();
                height = yellow.getHeight();
                Toast.makeText(getApplicationContext(),"가로 : " + width + " 세로 : " + height,
                        Toast.LENGTH_SHORT).show();
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = black.getWidth();
                height = black.getHeight();
                Toast.makeText(getApplicationContext(),"가로 : " + width + " 세로 : " + height,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}