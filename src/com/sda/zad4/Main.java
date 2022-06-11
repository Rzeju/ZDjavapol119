package com.sda.zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Pifpaf pifpaf = new Pifpaf(number);
        pifpaf.writeOnScreen();

    }
}
