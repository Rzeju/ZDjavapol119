package com.sda.zad18;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(^|\\s)a+\\s+psik($|\\s)");
        String input = "dsasadsdas aaaaaaaa psik jhgjhgjh";

        boolean result = pattern.matcher(input).find();

        if (result) {
            System.out.println("User kichnął");
        } else {
            System.out.println("User nie kichnął");
        }
    }
}
