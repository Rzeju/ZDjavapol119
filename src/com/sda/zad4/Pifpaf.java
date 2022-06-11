package com.sda.zad4;

public class Pifpaf {

    private int number;

    public Pifpaf(int number) {
        this.number = number;
    }

    public void writeOnScreen() {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }

    }
}
