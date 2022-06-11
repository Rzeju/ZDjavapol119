package com.sda.zad3;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int calculateDelta() {
        return b * b - 4 * a * c;
    }

    public void solveEquation() {

        if (a == 0) {
            System.out.println("Podaj a większe od 0");
        } else {
            int delta = calculateDelta();

            if (delta < 0) {
                System.out.println("Delta ujemna - brak rozwiązań");
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1 + " " + "x2 = " + x2);
            }
        }
    }
}
