package com.sda.zad8;

public class Calculator {

    private float firstNumber;
    private char operationSign;
    private float secondNumber;

    public Calculator(float firstNumber, char operationSign, float secondNumber) {
        this.firstNumber = firstNumber;
        this.operationSign = operationSign;
        this.secondNumber = secondNumber;
    }

    public float calculate() {
        if (operationSign == '+') {
            return firstNumber + secondNumber;
        } else if (operationSign == '-') {
            return firstNumber - secondNumber;
        } else if (operationSign == '/') {
            if (secondNumber == 0) {
                System.out.println("Błąd");
                return 0;
            }
            return firstNumber / secondNumber;
        } else if (operationSign == '*') {
            return firstNumber * secondNumber;
        } else {
            System.out.println("Błędny znak");
            return 0;
        }
    }

    public float calculateWithSwitch() {
        switch (operationSign) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Błąd");
                    return 0;
                }
                return firstNumber / secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                System.out.println("Błędny znak");
                return 0;
        }
    }
}
