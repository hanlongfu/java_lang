package com.hanlongfu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] input = readIntegers(5);
        printArray(input);
        System.out.println("The minimum value is: " + findMin(input));
    }

    //readIntegers
    public static int[] readIntegers(int count){
        int[] integersEntered = new int[count];
        System.out.println("Enter " + count + " values.");
        for (int i = 0; i < count; i++) {
            integersEntered[i] = scanner.nextInt();
        }
        return integersEntered;
    }

    //print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //find min
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if(array[i] < min){
               min = array[i];
           }
        }
        return min;
    }

}
