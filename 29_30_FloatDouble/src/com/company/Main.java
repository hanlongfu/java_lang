package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

  public static void main(String[] args) {
  //single precision occupies 32 bits (float: 1.4e-45 to 3.4e38)
  //double precision occupies 64 bits (double:4.9e-324 to 1.79e308)
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float Minimum Value = " + myMinFloatValue);
    System.out.println("Float Maximum Value = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double Minimum Value = " + myMinDoubleValue);
    System.out.println("Double Maximum Value = " + myMaxDoubleValue);

    //declare float and double
    //5.25 is double by default, add f as suffix if you want float
    //in general, double is preferred
    //or cast as float - (float) 5.25
    //float myFloatValue = 5.25;
    int myIntValue = 5/3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5.0 /3.0;
    System.out.println("myIntValue = " + myIntValue);
    System.out.println("myFloatValue = " + myFloatValue);
    System.out.println("myFloatValue = " + myDoubleValue);

    //Challenge: convert pounds to kilos
    double lbs = 145.67;
    double kilos = lbs * 0.45359237;
    System.out.println("Number of kilos: " + kilos);

  }
}
