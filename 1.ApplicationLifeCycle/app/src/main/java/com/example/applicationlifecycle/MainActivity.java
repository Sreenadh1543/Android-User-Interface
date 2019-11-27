package com.example.applicationlifecycle;

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

    @Override
    protected void onStart() {
        super.onStart();
        logger.info("Test : The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger.info("Test : The onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger.info("Test :The onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger.info("Test : The onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger.info("Test : The onDestroy() event");

    }

}