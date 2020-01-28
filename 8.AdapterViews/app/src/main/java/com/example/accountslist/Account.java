package com.example.accountslist;

public class Account {

    private String accountNumber;
    private String name;
    private String accountType;
    private String amount;
    private String currency;

    public Account(String accountNumber, String name, String amount, String accountType, String currency) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.amount = amount;
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
