package com.sda.zad7;

public class Main {

    public static void main(String[] args) {

        int n = 6;
        Fibonacci fibonacci = new Fibonacci(n);

        int element_1 = fibonacci.calculateElement();
        int element_2 = fibonacci.calculateElement_optimal_1();

        System.out.printf("%d element ciągu wynosi - %d%n", n, element_1);
        System.out.printf("%d element ciągu wynosi - %d%n", n, element_2);

        //Recursion

        int element_resursion = Fibonacci.calculateElementRecursion(n);
        System.out.printf("%d element ciągu wynosi - %d%n", n, element_resursion);

        //Static public field example

        Fibonacci fibonacci_1 = new Fibonacci(5);
        Fibonacci fibonacci_2 = new Fibonacci(10);
        Fibonacci fibonacci_3 = new Fibonacci(100);
        Fibonacci fibonacci_4 = new Fibonacci(20);

        System.out.println("");
        System.out.println("Static field Example!");

        System.out.println(fibonacci_1.getX());
        System.out.println(fibonacci_2.x);
        System.out.println(fibonacci_3.x);
        System.out.println(fibonacci_4.getX());

        fibonacci_3.x = 20;

        System.out.println("");
        System.out.println(" Next Static field Example!");
        System.out.println(fibonacci_1.getX());
        System.out.println(fibonacci_2.x);
        System.out.println(fibonacci_3.x);
        System.out.println(fibonacci_4.getX());

        //Static private field example

        fibonacci_4.setY(-100);

        System.out.println("");
        System.out.println(" Next Static field Example!");
        System.out.println(fibonacci_1.getY());
        System.out.println(fibonacci_2.getY());
        System.out.println(fibonacci_3.getY());
        System.out.println(fibonacci_4.getY());
    }

}
