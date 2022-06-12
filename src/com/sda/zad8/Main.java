package com.sda.zad8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        char operationSign = scanner.next().charAt(0);
        float b = scanner.nextFloat();

        Calculator calculator = new Calculator(a, operationSign, b);

        System.out.println(calculator.calculateWithSwitch());

        String example = "+asdgh123";
        char[] table = example.toCharArray();

        for (int i = 0; i < table.length; i++) {
            System.out.printf("Index = %d, Char pod indexem = %c%n", i, table[i]);
        }
    }
}
