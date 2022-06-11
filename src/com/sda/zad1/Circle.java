package com.sda.zad1;

public class Circle {

    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double calculatePerimeter() {
        return Math.PI * diameter;
    }
}
