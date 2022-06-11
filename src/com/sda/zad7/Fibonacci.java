package com.sda.zad7;

public class Fibonacci {

    private final int n;

    public static int x = 5;

    private static int y = 10;

    public Fibonacci(int n) {
        this.n = n;
    }

    int calculateElement() {
        int previous = 1;
        int current = 1;

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                int next = current + previous;
                previous = current;
                current = next;
            }
        }

        return current;
    }

    int calculateElement_optimal_1() {
        int previous = 1;
        int current = 1;

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                current = current + previous;
                previous = current - previous;
            }
        }

        return current;
    }

    public static int calculateElementRecursion(int n) {

        if (n < 3) {
            return 1;
        }

        return calculateElementRecursion(n -1) + calculateElementRecursion(n - 2);
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
