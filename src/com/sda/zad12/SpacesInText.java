package com.sda.zad12;

public class SpacesInText {

    private String text;

    public SpacesInText(String text) {
        this.text = text.trim();
    }

    public double calculateSpacesInText() {
        String[] chars = text.split("");

        double spaces = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals(" ")) {
                spaces++;
            }
        }
        return spaces / text.length() * 100;
    }

    public double calculateSpacesWithReplace() {
        String textWithoutSpaces = text.replace(" ", "");
        double spaces = text.length() - textWithoutSpaces.length();
        return spaces / text.length() * 100;
    }
}
