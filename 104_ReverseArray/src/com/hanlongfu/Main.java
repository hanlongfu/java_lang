package com.hanlongfu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(array);

    }

    private static void reverse(int[] array){
        
        System.out.println("Array = " + Arrays.toString(array));
        int temp;
        for (int i = 0; i < (int)(array.length/2); i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        System.out.println("Array = " + Arrays.toString(array));
    }
}
