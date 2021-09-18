package com.hanlongfu;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(21356));
        System.out.println(sumDigits(9));
    }

    public static int sumDigits(int n) {
        if(n < 10) return -1;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
