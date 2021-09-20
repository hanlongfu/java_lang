package com.hanlongfu;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // additional
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    //constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        printing();
    }

    //printing initial message
    public void printing(){
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

    //printing extra items
    public void printingExtra(String name, double price){
        System.out.println("Added " + name + " for an extra " + price);
    }

    //getter
    public double getPrice() {
        return price;
    }

    //setter
    public void setPrice(double extraPrice){
        this.price = this.price + extraPrice;
    }

    //additional methods
    public void addHamburgerAddition1(String name, double price){
        this.price = price + this.getPrice();
        printingExtra(name, price);
    }

    public void addHamburgerAddition2(String name, double price){
        this.price = price + this.getPrice();
        printingExtra(name, price);

    }

    public void addHamburgerAddition3(String name, double price){
        this.price = price + this.getPrice();
        printingExtra(name, price);

    }
    public void addHamburgerAddition4(String name, double price){
        this.price = price + this.getPrice();
        printingExtra(name, price);

    }

    public double itemizeHamburger(){
        return this.price;
    }

}
