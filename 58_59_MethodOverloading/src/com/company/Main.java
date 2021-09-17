package com.company;

public class Main {

  public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
    System.out.println("New score is " + newScore);
    double doubleScore = calculateScore("Gilbert", 751.09);
    System.out.println("Overloaded score is " + doubleScore);

    double feetInchesToCm = calcFeetAndInchesToCentimeters(-10);
    System.out.println(feetInchesToCm);

  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " score " + score + " points");
    return score * 1000;
  }

  //method overloading
  //unique signature - (method name + parameters)
  //just change the data type is not sufficient to have unique signature
  public static double calculateScore(String playerName, double score) {
    System.out.println("Player " + playerName + " score " + score + " points");
    return score * 1000;
  }

  //calculate feet and inches to centimeters
  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12) return -1;
    return inches * 2.54 + feet * 12 * 2.54;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if(inches < 0) return -1;
    double inchesToFeet = (int) (inches / 12);
    double remainingInches = inches % 12;
    return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);
  }


}
