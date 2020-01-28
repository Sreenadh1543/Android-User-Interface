package com.example.accountslist;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

      @Override
      public void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);

          setContentView(R.layout.activity_main);

          AccountAdapter adapter = new AccountAdapter(this,createAccountList());

          ListView accountsList = (ListView)findViewById(R.id.accounts_list_view);

          accountsList.setAdapter(adapter);
      }

      private List<Account> createAccountList(){

                 Account account1 = new Account("AT61 1904 3002 3457 3201","Sreenadh Mahavadi","10.00","Savings Account","EUR");

                 Account account2 = new Account("BE68 5390 0754 7034","Vasa Karthikeya","12.00","Current Account","EUR");

                 Account account3 = new Account("BG80 BNBG 9661 1020 3456 78","Udaya Ganikunta","100.00","Current Account","EUR");

                 Account account4 = new Account("CY17 0020 0128 0000 0012 0052 7600","Koneru Harsha","50.00","Savings Account","EUR");

                 Account account5 = new Account("FI21 1234 5600 0007 85","Virat Kohli","63.00","Current Account","EUR");

                 Account account6 = new Account("FR14 2004 1010 0505 0001 3M02 606","Sachin Tendulkar","56.00","Savings Account","EUR");

                 Account account7 = new Account("IE29 AIBK 9311 5212 3456 78","Rahul Ravindran","123.00","Current Account","EUR");

                 Account account8 = new Account("IT60 X054 2811 1010 0000 0123 456","Vijay Devarkonda","98.00","Savings Account","EUR");

                 Account account9 = new Account("LU28 0019 4006 4475 0000","Mahesh Babu","236.00","Current Account","EUR");

                 Account account10 = new Account("FR14 2004 1010 0505 0001 3M02 606","Chiranjeevi","56.00","Savings Account","EUR");

          return Arrays.asList(account1,account2,account3,account4,account5,account6,account7,account8,account9,account10);
      }

}



