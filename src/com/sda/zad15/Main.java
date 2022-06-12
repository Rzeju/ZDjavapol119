package com.sda.zad15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] test = {1, 3, 2 ,1, 1, 3, 2, 5, 7, 10, 10, 9, -5};

        System.out.println("Sposob dłuzszy");
        findNumbers(test);
        System.out.println(" ");

        System.out.println("Z uzyciem Set");
        usingSet(test);
    }

    static void findNumbers(int[] numbers) {
        int size = numbers.length;
        boolean visited[] = new boolean[size];
        Arrays.fill(visited, false);

        for (int i =0; i < size; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    static Set usingSet(int[] number) {

        Set uniques = new HashSet();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < number.length; i++) {
            if (!uniques.add(number[i])) {
                result.add(number[i]);
            }
        }

        for (Integer i : result) {
            System.out.print(i + " ");
        }

        return result;
    }
}
