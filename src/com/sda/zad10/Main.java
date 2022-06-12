package com.sda.zad10;

public class Main {

    public static void main(String[] args) {

        int number = 123;

        DigitSum digitSum = new DigitSum(number);

        System.out.printf("Podana liczba to %d%n", number);

        System.out.println(digitSum.notOptimalSumDigits());
        System.out.println(digitSum.fastSumDigit());
        System.out.println(digitSum.oopSumDigits());
    }
}
