package com.hanlongfu;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    //methods
    public String startEngine(){
        return "Car engine started!";
    }

    public String accelerate(){
        return "Car accelerated!";
    }

    public String brake(){
       return "Car brake is pressed!";
    }
}

class Nissan extends Car{
    public Nissan() {
        super(4, "Nissan Altima");
    }

    @Override
    public String startEngine() {
        return "Nissan Engine started!";
    }
}

class Ford extends Car{
    public Ford() {
        super(8, "Ford Fiesta");
    }

    @Override
    public String startEngine() {
        return "Ford engine started!";
    }
}

class VW extends Car{
    public VW() {
        super(6, "VW Passat");
    }

    @Override
    public String startEngine() {
        return "VW engine started!";
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            // assign a static method to a variable/object
            Car car = startEngine();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" +
                               "Start engine: " + car.startEngine() + "\n");

        }
    }

    //static method
    public static Car startEngine(){
        int randomNumber = (int) (Math.random() * 3 + 1);
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Nissan();
            case 2:
                return new Ford();
            case 3:
                return new VW();
        }
        return null;
    }




}
