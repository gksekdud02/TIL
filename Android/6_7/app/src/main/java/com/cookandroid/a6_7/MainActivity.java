package com.cookandroid.a6_7;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    ActionBar.Tab tabDog, tabCat, tabRabbit, tabHorse;
    MyTabFragment myFrags[] = new MyTabFragment[4];
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제6-7");
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabDog = bar.newTab();
        tabDog.setIcon(R.drawable.icon_dog);
        tabDog.setTabListener(this);
        bar.addTab(tabDog);

        tabCat = bar.newTab();
        tabCat.setIcon(R.drawable.icon_cat);
        tabCat.setTabListener(this);
        bar.addTab(tabCat);

        tabRabbit = bar.newTab();
        tabRabbit.setIcon(R.drawable.icon_rabbit);
        tabRabbit.setTabListener(this);
        bar.addTab(tabRabbit);

        tabHorse = bar.newTab();
        tabHorse.setIcon(R.drawable.icon_horse);
        tabHorse.setTabListener(this);
        bar.addTab(tabHorse);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;

        if (myFrags[tab.getPosition()] == null) {

            myTabFrag = new MyTabFragment();
            Bundle data = new Bundle();
            data.putInt("tabName", tab.getPosition());

            myTabFrag.setArguments(data);
            myFrags[tab.getPosition()] = myTabFrag;
        } else
            myTabFrag = myFrags[tab.getPosition()];


        ft.replace(android.R.id.content, myTabFrag);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    public static class MyTabFragment extends androidx.fragment.app.Fragment {
        int tabNum;
        private MainActivity mActivity;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle data = getArguments();
            tabNum = data.getInt("tabName");
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View myView = inflater.inflate(R.layout.activity_main,null);
            ImageView imageView = (ImageView)myView.findViewById(R.id.imageView);

            if (tabNum == 0)
                imageView.setImageResource(R.drawable.dog);
            if (tabNum == 1)
                imageView.setImageResource(R.drawable.cat);
            if (tabNum == 2)
                imageView.setImageResource(R.drawable.rabbit);
            if (tabNum == 3)
                imageView.setImageResource(R.drawable.horse);

            return myView;
        }
    }
}