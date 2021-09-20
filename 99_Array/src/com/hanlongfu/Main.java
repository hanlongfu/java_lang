package com.hanlongfu;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));

    }

    //read integers and store in an array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //print an array
    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    //sort an array in descending order
    /*
    public static int[] sortIntegers(int[] rawArray) {
        //int[] sortedArray = new int[rawArray.length];
        int temp;
        for (int i = 1; i < rawArray.length; i++) {
            for (int j = i; j > 0; j--) {
              if(rawArray[j] > rawArray[j-1]) {
                  temp = rawArray[j];
                  rawArray[j] = rawArray[j-1];
                  rawArray[j-1] = temp;
              }
            }
        }
        return rawArray;
    }
    */

    //second approach
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            //just copy the elements into a new array
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }



}
// [10, 100, 3, -1, 50]
// i = 1, j = 1 ->  arr[1] > arr[0] 100 > 10 -> arr[0] = 100, arr[1] = 10      [100, 10, 3, -1, 50]
// i = 2, j = 2 ->  arr[2] > arr[1] 3 > 10  No
// i = 3, j = 3 ->  arr[3] > arr[2] -1 > 3  NO
// i = 4, j = 4 ->  arr[4] > arr[3] 50 > -1  YES -> arr[3] = 50, arr[4] = -1    [100, 10, 3, 50. -1]
//                  arr[3] > arr[2] 50 > 3   YES -> arr[2] = 50, arr[3] = 3     [100, 10, 50, 3, -1]
//                  arr[2] > arr[1] 50 > 10  YES -> arr[1] = 50, arr[2] = 10    [100, 50, 10, 3, -1]
//                  arr[1] > arr[0] 50 > 100 NO














