package com.hanlongfu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        /*
        for (int i = 0; i < 10; i++) {
            //Integer.valueOf(i) -- autoboxing
            //from primitive to class
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < intArrayList.size() ; i++) {
            //intArrayList.get(i).intValue()  -- unboxing
            //from class to primitive
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
         */

        //double type autoboxing
        ArrayList<Double> myDoubleValue = new ArrayList<>();
        for (double dbl= 0.0; dbl <= 10.00; dbl += 0.5) {
            myDoubleValue.add(dbl);
        }

        //double type unboxing
        for (int i = 0; i < myDoubleValue.size(); i++) {
            double value = myDoubleValue.get(i);
            System.out.println(i + " --> " + value);
        }








    }
}
