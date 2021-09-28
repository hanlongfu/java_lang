package com.hanlongfu;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    //constructor
    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    //getter for the branch
    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //add new customer and initial transaction amount
    public boolean newCustomer(String customerName, double initAmount){
        //customer not already on file
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initAmount));
            return true;
        }
        //customer already exists
        return false;
    }

    //add additional transaction for customer/branch
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        //check if customer is on file
        if(findCustomer(customerName) != null){
            //add transaction
            existingCustomer.addTransaction(amount);
            return true;
        }
        //not able to find customer
        return false;

    }

    //find customer
    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
