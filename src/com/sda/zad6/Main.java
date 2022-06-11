package com.sda.zad6;

public class Main {

    public static void main(String[] args) {

        Harmonic harmonic = new Harmonic(100);
        double sum = harmonic.calculate();

        System.out.printf("Suma ciągu harmonicznego wynosi - %f", sum);
    }
}
