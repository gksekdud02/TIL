package com.cookandroid.a7_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View toastView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("7_5");

        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast toast = new Toast(MainActivity.this);

               toastView = (View) View.inflate(MainActivity.this,R.layout.toast1,null);

               Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
               int xOffset = (int)(Math.random() * display.getWidth());
               int yOffset = (int)(Math.random() * display.getHeight());

               toast.setGravity(Gravity.TOP | Gravity.RIGHT, xOffset,yOffset);
               toast.setView(toastView);
               toast.show();
            }
        });
    }
}