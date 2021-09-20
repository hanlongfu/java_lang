package com.hanlongfu;

public class Main {

    public static void main(String[] args) {
//	    BankAccount bankAccount = new BankAccount();
        //BankAccount bankAccount = new BankAccount(12345, 1000.59, "Jason Bourne", "Jason@gmail.com", "333-333-3333");

//        System.out.println("Account number: " + bankAccount.getAccountNumber());
//        System.out.println("Name: " + bankAccount.getCustomerName());
//        System.out.println("Phone: " + bankAccount.getCustomerPhone());
//        System.out.println("Email: " + bankAccount.getCustomerEmail());
//        System.out.println("Balance: " + bankAccount.getBalance());
//
//        System.out.println(" ");
//
//        bankAccount.depositFunds(3500.67);
//        bankAccount.withdrawFunds(1500.345);
//
//        System.out.println(" ");
//
//        BankAccount timsAccount = new BankAccount("Tim","tim@email.com", "222-222-2222" );
//        timsAccount.depositFunds(500);
//        timsAccount.withdrawFunds(100);
//        System.out.println( timsAccount.getAccountNumber());

        VipCustomer timsVipAcct = new VipCustomer();
        System.out.println(timsVipAcct.getCustomerName());

        VipCustomer gilbertVipAcct = new VipCustomer("Gilbert Gotfried", 50000);
        System.out.println(gilbertVipAcct.getCustomerName());


    }
}
