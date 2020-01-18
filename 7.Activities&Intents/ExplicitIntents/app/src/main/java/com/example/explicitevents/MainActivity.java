package com.example.explicitevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.name);
    }


    public void navigate(View view) {
        Intent intent= new Intent(this, SecondaryActivity.class);
        intent.putExtra("name",name.getText().toString());
        startActivity(intent);
    }
}

