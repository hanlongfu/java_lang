package com.hanlongfu;

import java.util.Locale;

public class Car {
    //fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //setters
    //setters allow us to check for invalid values
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) this.model = model;
        else this.model="Unknown";
    }
    //getters
    public String getModel(){
        return this.model;jhfc
    }

}
