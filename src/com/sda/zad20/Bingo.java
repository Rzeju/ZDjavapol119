package com.sda.zad20;

import java.util.Random;

public class Bingo {

    private final int answer;

    public Bingo() {
        Random random = new Random();
        this.answer = random.nextInt(100 + 1);
    }

    public int getAnswer() {
        return answer;
    }
}
