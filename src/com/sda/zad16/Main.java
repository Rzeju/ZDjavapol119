package com.sda.zad16;

public class Main {

    public static void main(String[] args) {

        int[] test = {7, 8, 9, 10, 11, 12, 13, 3, 8, 4, 2, 5, 6, 11, 13, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(
                "1. W metodzie Main - Najdłuzszy rosnący podciąg w tablicy wynosi: "
                        + theLongestRisingSequence(test));

        SequenceFinder sequenceFinder = new SequenceFinder();

        System.out.println(
                "2. Obiektowo - Najdłuzszy rosnący podciąg w tablicy wynosi: "
                        + sequenceFinder.theLongestRisingSequence(test));
    }

    static int theLongestRisingSequence(int[] numbers) {
        int counter = 1;
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
                if (counter > result) {
                    result = counter;
                }
            } else {
                counter = 1;
            }
        }
        return result;
    }
}
