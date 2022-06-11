package com.sda.zad6;

public class Harmonic {

    private int n;

    public Harmonic(int n) {
        this.n = n;
    }

    public double calculate() {
        double result = 0;
        for (double i = 1; i <= n; i++) {
            result = result + 1/i;
        }

        return result;
    }
}
