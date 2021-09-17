package com.company;

public class Main {

  public static void main(String[] args) {
    // char occupies 16 bits (2 bytes)
    char myChar = 'D';
    // see unicode-table.com
    char myUnicodeD = '\u0044';
    char myUnicodeCopy = '\u00A9';
    System.out.println(myUnicodeD);
    System.out.println(myUnicodeCopy);

    //Boolean Type
    boolean myTrueBoolean = true;
    boolean myFalseBoolean = false;
    System.out.println(myTrueBoolean);
    System.out.println(false);

    //String is a class not a primitive
    String myString = "This is a string";
    System.out.println("myString is equal to: " + myString);

    //append a String
    myString += ", and this is more.";
    System.out.println("myString is equal to: " + myString);

    //implicit conversion (convert to lower-level data types)
    int myInt = 50;
    String lastString = "10";
    lastString = lastString + myInt;
    System.out.println(lastString);

    //Strings are immutable
  }
}
