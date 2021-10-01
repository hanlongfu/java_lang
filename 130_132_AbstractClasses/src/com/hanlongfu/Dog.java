package com.hanlongfu;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }
}
