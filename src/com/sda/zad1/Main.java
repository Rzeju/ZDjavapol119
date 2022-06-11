package com.sda.zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();

        //Bez użycia technik obiektowych
        System.out.printf("Obwód koła wynosi o średnicy d = %f, wynosi - %f%n", diameter, calculateCirclePerimeter_f(diameter));
        System.out.printf("Obwód koła wynosi o średnicy d = %f, wynosi - %f%n", diameter, calculateCirclePerimeter_d(diameter));

        //Z użyciem technik obiekiektowych -  OOP
        Circle circle_1 = new Circle(diameter);
        Circle circle_2 = new Circle(100);

        System.out.println(circle_1.calculatePerimeter());
    }

    static float calculateCirclePerimeter_f(float diameter) {
        return (float) Math.PI * diameter;
    }

    static double calculateCirclePerimeter_d(double diameter) {
        return  Math.PI * diameter;
    }
}
