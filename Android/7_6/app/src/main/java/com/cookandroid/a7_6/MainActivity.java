package com.cookandroid.a7_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit, rdoHorse;
    Button button1;
    View dialogView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 7_6");

        button1 = (Button) findViewById(R.id.btn1);

        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        rdoDog = (RadioButton) findViewById(R.id.dog);
        rdoCat = (RadioButton) findViewById(R.id.cat);
        rdoRabbit = (RadioButton) findViewById(R.id.rabbit);
        rdoHorse = (RadioButton) findViewById(R.id.horse);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(MainActivity.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                imageView = dialogView.findViewById(R.id.imgView);
                dlg.setView(dialogView);
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.dog:
                        dlg.setTitle("강이지");
                        imageView.setImageResource(R.drawable.dog);
                        break;
                    case R.id.cat:
                        dlg.setTitle("고양이");
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rabbit:
                        dlg.setTitle("토끼");
                        imageView.setImageResource(R.drawable.rabbit);
                        break;
                    case R.id.horse:
                        dlg.setTitle("말");
                        imageView.setImageResource(R.drawable.horse);
                        break;

                }
                dlg.setNegativeButton("취소", null);
                dlg.show();
            }
        });
    }
}