package com.hanlongfu;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("509-339-5615");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();

            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
       }
        scanner.close();
    }

    private static void addNewContact() {
        //receive input from user
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        //create a new Contact object with name and phone entered
        Contact newContact = new Contact(name, phone);

        //add to ArrayList using mobilePhone.addNewContact() method
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter contact name you want to update: ");
        String name = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }

        //read in new contact name
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();

        //read in new contact phone number
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();

        //create new contact object from information entered
        Contact newContact = new Contact(newName, newNumber);

        //display information if successfully updated
        if(mobilePhone.updateContact(oldContact, newContact)){
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact name you want to remove: ");
        String name = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(name);

        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(oldContact)){
            System.out.println("Successfully deleted!");
        } else {
            System.out.println("Error deleting contact!");
        }
    }

    private static void queryContact(){
        System.out.println("Enter contact name to search: ");
        String name  = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);

        if(existingContact == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number: " + existingContact.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
