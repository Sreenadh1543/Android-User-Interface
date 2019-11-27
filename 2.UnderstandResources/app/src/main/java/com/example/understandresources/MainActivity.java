package com.example.understandresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainActivity extends AppCompatActivity {


    Logger logger = LoggerFactory.getLogger(MainActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logger.info("Test : The onCreate() event");
    }



}