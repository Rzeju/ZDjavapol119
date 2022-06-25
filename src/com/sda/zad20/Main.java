package com.sda.zad20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bingo bingo = new Bingo();
        System.out.println(bingo.getAnswer());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int givenNumber = scanner.nextInt();
            if (givenNumber > bingo.getAnswer()) {
                System.out.println("Za dużo");
            } else if (givenNumber < bingo.getAnswer()) {
                System.out.println("Za mało");
            } else {
                System.out.println("Bingo!");
                break;
            }
        }
    }
}
