package com.cookandroid.a4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox chkEnabled, chkClickable, chkRotation;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-7");

        chkEnabled = (CheckBox) findViewById(R.id.Enabled);
        chkClickable = (CheckBox) findViewById(R.id.Clickable);
        chkRotation = (CheckBox) findViewById(R.id.Rotation);

        btn = (Button) findViewById(R.id.btn);

        chkEnabled.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(chkEnabled.isChecked() == true){
                    btn.setEnabled(false);
                }
                else
                    btn.setEnabled(true);
            }
        });
         chkClickable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                 if(chkClickable.isChecked() == true){
                     btn.setClickable(true);
                 }
                 else
                     btn.setClickable(false);
             }
         });

         chkRotation.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                 if(chkRotation.isChecked() == true){
                     btn.setRotation(45);
                 }
                 else
                     btn.setRotation(0);
             }
         });
    }
}