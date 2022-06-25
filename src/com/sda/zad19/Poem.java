package com.sda.zad19;

public class Poem {

    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }
}
