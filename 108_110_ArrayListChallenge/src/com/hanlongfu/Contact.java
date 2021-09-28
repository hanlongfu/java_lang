package com.hanlongfu;

public class Contact {
    private String name;
    private String phoneNumber;

    //constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //create a new contact
    //factory method
//    public static Contact createContact(String name, String phoneNumber){
//        return new Contact(name, phoneNumber);
//    }
}
