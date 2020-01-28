package com.example.accountslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AccountAdapter extends ArrayAdapter<Account> {

    public AccountAdapter(Context context,List<Account> accounts){
      super(context,0,  accounts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Account account = getItem(position);

        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.accounts_list_text_view,parent,false);


        }

        TextView accountNumber = (TextView) convertView.findViewById(R.id.account_number_text_view);

        TextView accountName = (TextView) convertView.findViewById(R.id.account_name_text_view);

        TextView accountType = (TextView) convertView.findViewById(R.id.account_type_text_view);

        TextView amount = (TextView) convertView.findViewById(R.id.amount_text_view);

        accountNumber.setText(account.getAccountNumber());

        accountName.setText(account.getName());

        accountType.setText(account.getAccountType());

        amount.setText(account.getAmount()+account.getCurrency());

        return convertView;
    }
}
