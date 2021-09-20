package com.hanlongfu;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //constructor
    public BankAccount(){
        //if no parameters provided, use overloaded constructor with default parameters
        // call to this() must be the very first line of the constructor
        this(133359, 0.00, "Default Name", "seomemail@domain.com", "000-000-0000");
        System.out.println("Empty Constructor called!");
    }

    //overloaded constructor
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    //another overloaded constructor (with 2 default and 3 user added parameters)
    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(11567, 100.55,customerName, customerEmail, customerPhone);
    }

    //getters;
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getCustomerPhone(){
        return this.customerPhone;
    }

    //setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    //deposit funds
    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount){
        if(withdrawAmount <= balance) this.balance -= withdrawAmount;
        System.out.println("Your new balance is: " + this.balance);
    }
}
