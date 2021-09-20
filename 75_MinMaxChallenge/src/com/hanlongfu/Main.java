package com.hanlongfu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Read the numbers from the console

        Scanner scanner = new Scanner(System.in);
        int min=0, max=0;
        boolean first = true;
        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt) break;

            int number = scanner.nextInt();

            if(first) {
                first = false;
                min = number;
                max = number;
            }

            if(number>max) max = number;
            if(number<=min) min = number;

            scanner.nextLine();
        }
        System.out.println("Min, Max = " + min + "," + max);
        scanner.close();
    }
}
