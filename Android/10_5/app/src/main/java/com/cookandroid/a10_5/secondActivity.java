package com.cookandroid.a10_5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class secondActivity extends Activity {
    Button btnNewActivity1,btnReturn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        btnNewActivity1 = (Button) findViewById(R.id.btnNewActivity1);
        btnReturn = (Button) findViewById(R.id.btnReturn);
        btnNewActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),thirdActivity.class);
                startActivity(intent);
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
