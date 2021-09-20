package com.hanlongfu;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.setPrice(price);
        printingExtra(name, price);
    }
    public void addHealthyAddition2(String name, double price){
        this.setPrice(price);
        printingExtra(name, price);
    }


}
