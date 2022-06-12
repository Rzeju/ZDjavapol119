package com.sda.zad10;

public class DigitSum {

    private final int number;

    public DigitSum(int number) {
        this.number = number;
    }

    public int fastSumDigit() {
        int sum = 0;
        int n = number;
        do {
            sum += n % 10;
            n = n / 10;
        } while (n != 0);
        return sum;
    }

    public int notOptimalSumDigits() {
        int result = 0;
        double nextDigit;
        int i = 0;
        do {
            nextDigit = (number / Math.pow(10, i));
            int box = (int) nextDigit % 10;
            result = result + box;
            i++;
        } while (nextDigit > 0);

        return result;
    }

    public int oopSumDigits() {
        String textNumber  = String.valueOf(number);
        String[] array = textNumber.split("");
        int result = 0;
        //pętla for each, iteruje przez wszystkie elementy
        for (String s : array) {
            result = result + Integer.parseInt(s);
        }
        return result;
    }
}
