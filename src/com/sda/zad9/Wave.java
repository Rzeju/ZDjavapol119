package com.sda.zad9;

public class Wave {

    private int size;

    public Wave(int size) {
        this.size = size;
    }

    void drawWave() {

        int spacesBetween = 6;
        int spacesBefore = 1;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < size; j++) {

                for (int x = 0; x < spacesBefore - 1; x++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int y = 0; y < spacesBetween; y++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int x = 0; x < spacesBefore; x++) {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");

            spacesBefore = spacesBefore + 1;
            spacesBetween = spacesBetween - 2;
        }
    }
}
