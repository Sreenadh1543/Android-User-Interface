package com.example.understandresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainActivity extends AppCompatActivity {


    Logger logger = LoggerFactory.getLogger(MainActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logger.info("Test : The onCreate() event");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText textBoxInLauncherActivity=(EditText) findViewById(R.id.editText);

        textBoxInLauncherActivity.setText(getResources().getString(R.string.welcome_message));

    }



}