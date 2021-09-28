package com.hanlongfu;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    //constructor
    public Customer(String customerName, double initAmount) {
        this.customerName = customerName;
        //initialize transactions ArrayList
        this.transactions = new ArrayList<Double>();
        addTransaction(initAmount);
    }

    //add transaction amount
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    //getters
    public String getName() {
        return customerName;
    }

    //getter
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
