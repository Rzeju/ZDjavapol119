package com.sda.zad16;

public class SequenceFinder {

    public SequenceFinder() {
    }

    public int theLongestRisingSequence(int[] numbers) {
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
