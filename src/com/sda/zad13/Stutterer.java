package com.sda.zad13;

public class Stutterer {

    private String text;

    public Stutterer(String text) {
        this.text = text;
    }

    public void saySomething() {
        String[] somethingToSay = text.split(" ");

        for (int i = 0; i < somethingToSay.length; i++) {
            System.out.printf("%s %s ", somethingToSay[i], somethingToSay[i]);
        }
        System.out.println("");
    }

    public void repeat() {
        String[] somethingToSay = text.split(" ");

        for (int i = 0; i < somethingToSay.length; i++) {
            System.out.print((somethingToSay[i] + " ").repeat(2));
        }
        System.out.println("");
    }
}
