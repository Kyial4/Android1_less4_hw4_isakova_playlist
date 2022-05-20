package com.geektech.android1_less4_hw4_isakova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSupportFragmentManager().beginTransaction().add(R.id.container_main,new MainFragment()).commit();
       getSupportFragmentManager().beginTransaction().add(R.id.container_second,new SecondFragment()).commit();



    }
}