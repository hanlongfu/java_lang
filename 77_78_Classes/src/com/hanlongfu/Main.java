package com.hanlongfu;

public class Main {
    public static void main(String[] args) {
	    Car porsche = new Car();  //create an object
        Car holden = new Car();   //another object
        porsche.setModel("Buick");
        System.out.println(porsche.getModel());
    }
}
