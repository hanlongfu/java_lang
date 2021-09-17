package com.company;

public class Main {
    public static void main(String[] args) {
        //  Eight types of primitive data types: boolean, byte, char, short, int, long, float, double
	    int myValue = 10000;

	    //An integer is 32 bits
	    int myMinIntValue = Integer.MIN_VALUE;   //-2147483647
	    int myMaxIntValue = Integer.MAX_VALUE;   // 2147483647

	    System.out.println("Integer Minimum Value= " + myMinIntValue);
	    System.out.println("Integer Maximum Value= " + myMaxIntValue);

	    //when you add 1 to the max, it causes overflow
	    System.out.println("Busted Max value = " + (myMaxIntValue + 1));

		//when you subtract 1 from the minimum, it causes underflow
		System.out.println("Busted Min value = " + (myMinIntValue - 1));

		//A Byte is 8 bits
		byte myMinByteValue = Byte.MIN_VALUE;  //-128
		byte myMaxByteValue = Byte.MAX_VALUE;  //127
		System.out.println("Byte Minimum Value: " + myMinByteValue);
		System.out.println("Byte Maximum Value: " + myMaxByteValue);

		//A Short is 16 bits
		short myMinShortValue = Short.MIN_VALUE;  //-32768
		short myMaxShortValue = Short.MAX_VALUE;  //32767
		System.out.println("Short Minimum Value: " + myMinShortValue);
		System.out.println("Short Maximum Value: " + myMaxShortValue);

		//A long is 64 bits
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;  //-9223372036854775808
		long myMaxLongValue = Long.MAX_VALUE;  //9223372036854775807
		System.out.println("Long Minimum Value: " + myMinLongValue);
		System.out.println("Long Maximum Value: " + myMaxLongValue);

		// long > int > short > byte
		int myTotal = (myMinIntValue / 2);

		// we get error because java treats the stuff inside parens as int not byte
		//byte myNewByteValue = (myMinByteValue/2);
		byte myNewByteValue = (byte)(myMinByteValue/2);  //-64
		System.out.println("Half of Minimum Byte Value: " + myNewByteValue);

		//short myNewShortValue = (myMinShortValue /2 );
		short myNewShortValue = (short) (myMinShortValue/2); //-16384
		System.out.println("Half of Minimum Short Value: " + myNewShortValue);

		//Challenge:
		byte myValidByteValue = -60;
		short myValidShortValue = -1000;
		int myValidIntValue = 50000;
		long myTotalLongValue = 50000L + 10L * (myValidIntValue + myValidByteValue + myValidByteValue);
		System.out.println("myTotalLongValue is: " + myTotalLongValue);


    }
}
