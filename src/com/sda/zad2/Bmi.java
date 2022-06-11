package com.sda.zad2;

public class Bmi {

    private final float weight;
    private final int height;

    public Bmi(float weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    void calculateBmi() {
        double heightInMeters = height / 100.0f;
        double bmi = weight / Math.pow(heightInMeters, 2);

        if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("BMI optymalne - %f%n", bmi);
        } else {
            System.out.printf("BMI nieoptymalne - %f%n", bmi);
        }
    }
}
