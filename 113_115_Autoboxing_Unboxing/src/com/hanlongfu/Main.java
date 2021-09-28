package com.hanlongfu;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)

// Bank > Branch > Customer > Doubles

// Customer:
// Name, and the ArrayList of doubles.

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list of their transactions

// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        bank.addBranch("California");
        bank.addCustomer("California", "Tim", 1005);
        bank.addCustomer("California", "Jason", 50);

        bank.addBranch("Florida");
        bank.addCustomer("Florida", "Percy", 1700);
        bank.addCustomer("Florida", "Perkins", 1500);

        bank.addBranch("Louisiana");
        bank.addCustomer("Louisiana", "Jason", 1600);
        bank.addCustomer("Louisiana", "John", 5000);

        bank.addCustomerTransaction("California", "Tim", 1200);
        bank.addCustomerTransaction("California", "Jason", 1200);


        bank.listCustomer("California", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch does not exist.");
        }

        bank.listCustomer("Melbourne", true);

        if(!bank.addBranch("Melbourne")){
            System.out.println("Melbourne branch already exists!");
        }

    }
}
