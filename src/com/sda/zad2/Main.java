package com.sda.zad2;

public class Main {

    public static void main(String[] args) {

        Bmi bmi_1 = new Bmi(80, 170);
        Bmi bmi_2 = new Bmi(90, 200);

        bmi_1.calculateBmi();
        bmi_2.calculateBmi();

        calculateBmi(50, 160);
    }

    static void calculateBmi(float weight, int height) {
        double heightInMeters = height / 100.0f;
        double bmi = weight / Math.pow(heightInMeters, 2);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("BMI optymalne - %f%n", bmi);
        } else {
            System.out.printf("BMI nieoptymalne - %f%n", bmi);
        }

    }
}
