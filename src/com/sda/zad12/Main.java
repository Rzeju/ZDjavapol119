package com.sda.zad12;

public class Main {

    public static void main(String[] args) {

        String text = "qwer qw er ";


        SpacesInText spacesInText = new SpacesInText(text);

        System.out.println("Wynik uzyskany dwoma róznymi metodami");
        System.out.println(spacesInText.calculateSpacesInText());
        System.out.println(spacesInText.calculateSpacesWithReplace());
    }
}
