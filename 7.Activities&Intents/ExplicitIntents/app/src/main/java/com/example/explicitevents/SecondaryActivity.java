package com.example.explicitevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView selectedName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        selectedName=(TextView)findViewById(R.id.result);
        Bundle b1 = getIntent().getExtras();
        selectedName.setText(b1.getString("name"));
    }
}
