package com.hanlongfu;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    //empty constructor
    public VipCustomer(){
        this("default name", 5000.00, "default@default.com");
    }

    //constructor with 2 parameters
    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "default2@default.com");
    }

    //full constructor
    public VipCustomer(String customerName, double creditLimit, String customerEmail){
        System.out.println("Parameterized constructor called");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    //getters
    public String getCustomerName() {
        return this.customerName;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
}
