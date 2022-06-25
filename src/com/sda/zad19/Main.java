package com.sda.zad19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Author author_1 = new Author("Wisława Szymborksa", "Polish");
        Author author_2 = new Author("Pentti Saarikoski", "Finland");
        Author author_3 = new Author("Konstandinos Kawafis", "Greece");

        Poem poem_1 = new Poem(author_1, 50);
        Poem poem_2 = new Poem(author_2, 50);
        Poem poem_3 = new Poem(author_3, 50);

        Poem[] poems = {poem_1, poem_2, poem_3};
        Poem[] manyResults = new Poem[3];

        Poem result = poems[0];
        int j = 0;
        for (int i = 0; i < poems.length; i++) {
            if (result.getStropheNumbers() < poems[i].getStropheNumbers()) {
                result = poems[i];
                manyResults[j] = poems[i];
                j++;
            }
        }
        System.out.println("1. Największą liczbę zwrotek napisał/ła " + result.getCreator().getSurname());

        for (Poem poem : poems) {
            System.out.print("BONUS. Największą liczbę zwrotek napisał/ła " + poem.getCreator().getSurname() + " ");
        }
        System.out.println(" ");
        result = poems[0];
        for (Poem poem : poems) {
            if (result.getStropheNumbers() < poem.getStropheNumbers()) {
                result = poem;
            }
        }
        System.out.println("2. Największą liczbę zwrotek napisał/ła " + result.getCreator().getSurname());


        List<String> finalResult = Arrays.stream(poems)
                .max(Comparator.comparing(Poem::getStropheNumbers))
                .map(Poem::getCreator)
                .map(Author::getSurname)
                .stream().collect(Collectors.toList());


        finalResult.forEach(System.out::println);
    }
}
