package com.sda.zad13;

public class Main {

    public static void main(String[] args) {

        String text = "Ala ma kota";

        Stutterer stutterer = new Stutterer(text);

        stutterer.saySomething();
        stutterer.repeat();

    }
}
