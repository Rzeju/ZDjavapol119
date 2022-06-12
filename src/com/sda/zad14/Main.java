package com.sda.zad14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);

        LettersBetween lettersBetween = new LettersBetween(firstLetter, secondLetter);
        int result = lettersBetween.calculateLettersBetween();

        System.out.printf("Pomiedzy literami %c oraz %c - wynosi %d", firstLetter, secondLetter, result);
    }
}
