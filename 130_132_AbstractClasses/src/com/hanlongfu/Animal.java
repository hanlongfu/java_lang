package com.hanlongfu;

public abstract class Animal {
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //abstract method
    public abstract void eat();
    public abstract void breath();

    //getter
    public String getName() {
        return name;
    }
}


