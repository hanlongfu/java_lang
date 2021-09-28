package com.hanlongfu;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    //constructor
    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contact>();
        this.myNumber = myNumber;
    }

    //add New Contact
    public boolean addNewContact(Contact contact){
        //check if contact is already on file
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
        //ArrayList myContacts add contact object using built-in add method
        myContacts.add(contact);
        return true;
    }

    //update Contact
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        //check if the old contact exists
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
            //check if the new contact already exists
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    //remove Contact
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);

        //if not found
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted!");
        return true;
    }

    //find Contact
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        //loop through ArrayList
        for (int i = 0; i <myContacts.size(); i++) {
            //retrieve each object in ArrayList
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    //print Contacts
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i <myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    myContacts.get(i).getName() + "->" +
                    myContacts.get(i).getPhoneNumber());
        }
    }

    //query contact
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    //this function is used
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }

        return null;
    }


}
