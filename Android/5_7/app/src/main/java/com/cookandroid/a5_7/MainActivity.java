package com.cookandroid.a5_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setTitle("연습문제5-7");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,1);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout Layout1 = new LinearLayout(this);
        Layout1.setOrientation(LinearLayout.HORIZONTAL);
        Layout1.setLayoutParams(params);

        LinearLayout LayoutRed = new LinearLayout(this);
        LayoutRed.setBackgroundColor(Color.rgb(255,0,0));
        LayoutRed.setLayoutParams(params);

        LinearLayout LayoutBlue = new LinearLayout(this);
        LayoutBlue.setOrientation(LinearLayout.VERTICAL);
        LayoutBlue.setBackgroundColor(Color.rgb(0,0,255));
        LayoutBlue.setLayoutParams(params);

        LinearLayout Layout2 = new LinearLayout(this);
        Layout2.setOrientation(LinearLayout.VERTICAL);
        Layout2.setLayoutParams(params);

        LinearLayout LayoutYellow = new LinearLayout(this);
        LayoutYellow.setBackgroundColor(Color.YELLOW);
        LayoutYellow.setLayoutParams(params);

        LinearLayout LayoutBlack = new LinearLayout(this);
        LayoutBlack.setBackgroundColor(Color.BLACK);
        LayoutBlack.setLayoutParams(params);

        Layout2.addView(LayoutYellow);
        Layout2.addView(LayoutBlack);

        Layout1.addView(LayoutRed);
        Layout1.addView(Layout2);

        baseLayout.addView(Layout1);
        baseLayout.addView(LayoutBlue);

        setContentView(baseLayout,params);
    }
}