package com.hanlongfu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();  //check if it is integer
        scanner.
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();  //handle next line character ( enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;

            if(age >=0 && age <= 100){
                System.out.println("Your name is " + name + ". Your age is " + age + ".");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        //release the memory
        scanner.close();
    }
}
