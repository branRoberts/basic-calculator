package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = inputNumber.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = inputNumber.nextInt();

        int result = firstNumber * secondNumber;

        System.out.println("The result is: " + result);
        inputNumber.close();


    }
}
