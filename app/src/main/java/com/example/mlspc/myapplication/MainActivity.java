package com.example.mlspc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showNumber();
    }

    private void showNumber() {
        for(int i=0;i<100;i++) {
            System.out.println();
        }
    }
}
