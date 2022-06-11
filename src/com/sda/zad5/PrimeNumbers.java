package com.sda.zad5;

public class PrimeNumbers {

    private final int n;

    public PrimeNumbers(int n) {
        this.n = n;
    }

    void writePrimeNumbers() {
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber_optimalization_sqrt_2(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    private boolean isPrimeNumber(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    private boolean isPrimeNumber_optimalization_1(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < (number / 2) + 1; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    private boolean isPrimeNumber_optimalization_sqrt_2(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }


}
