package com.example.accountslist;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

      @Override
      public void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);

          setContentView(R.layout.activity_main);

          ListView accountsList = (ListView)findViewById(R.id.accounts_list_view);

          accountsList.setEmptyView(new View(this));
      }
}


