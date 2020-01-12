package com.example.clickevent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView clickStatus;

    Button buttonOne;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickStatus= (TextView)findViewById(R.id.button_clicked);
        buttonOne = (Button)findViewById(R.id.button1);
        buttonOne.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        clickStatus.setText("You clicked button B1");

    }

    public void clickButtonTwo(View view){
        clickStatus.setText("You clicked button B2");
    }

    public void clear(View view){
        clickStatus.setText("");
    }
}
