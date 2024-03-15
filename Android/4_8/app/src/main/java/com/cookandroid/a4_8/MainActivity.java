package com.cookandroid.a4_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-8");

        edit1 = (EditText) findViewById(R.id.Edit1);

        edit1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                result = edit1.getText().toString();
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}