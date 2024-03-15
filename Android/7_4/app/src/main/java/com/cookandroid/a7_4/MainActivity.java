package com.cookandroid.a7_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("7_4");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0,1,0,"강아지");
        menu.add(0,2,0,"고양이");
        menu.add(0,3,0,"토끼");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        ImageView img = (ImageView) findViewById(R.id.img1);

        switch (item.getItemId()){
            case 1:
                img.setImageResource(R.drawable.dog);
                return true;
            case 2:
                img.setImageResource(R.drawable.cat);
                return true;
            case 3:
                img.setImageResource(R.drawable.rabbit);
                return true;
        }
        return false;
    }
}