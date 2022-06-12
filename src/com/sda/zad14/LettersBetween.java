package com.sda.zad14;

public class LettersBetween {

    private int firstLetter;
    private int secondLetter;

    public LettersBetween(char firstLetter, char secondLetter) {
        this.firstLetter = firstLetter;
        this.secondLetter = secondLetter;
    }

    public int calculateLettersBetween() {
        int firstLetterAsci = firstLetter;
        int secondLetterAsci = secondLetter;

        return Math.abs(firstLetterAsci - secondLetterAsci) - 1;
    }
}
