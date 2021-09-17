package com.company;

public class Main {

  public static void main(String[] args) {
    boolean isAlien = false;
    if(isAlien == false){
      System.out.println("It is not an alien");
    }
    int topScore = 90;
    if(topScore != 100){
      System.out.println("You got the high score!");
    }

    // logical AND  &&
    int secondTopScore = 78;
    if(topScore != 100 && secondTopScore == 74){
      System.out.println("Not equal to 100 and equal to 74");
    } else {
      System.out.println("Either one is false.");
    }

    //logical OR  ||
    if(topScore != 100 || secondTopScore == 74){
      System.out.println("Not equal to 100 or equal to 74");
    } else {
      System.out.println("Either one is false.");
    }

    //ternary operator
    boolean isCar = false;
    isCar = true;
    boolean wasCar = isCar ? true : false;

    if(wasCar) {
      System.out.println("wasCar is true");
    }

    int ageOfClient = 20;
    boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
    System.out.println(isEighteenOrOver);

    // challenge
    double doubleOne = 20.00d;
    double doubleTwo = 80.00d;
    double sumMult = (doubleOne + doubleTwo) * 100.00d;
    double remainder = sumMult % 40.00d;
    System.out.println(remainder);

    boolean isZero = (remainder == 0) ? true : false;
    System.out.println(isZero);

    if(!isZero) System.out.println("Got some remainder");

  }
}
