package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
// this line above creates the input for future use and calling it inputNumber
        System.out.print("Enter first number: ");
        int firstNumber = inputNumber.nextInt();
// the two lines above asks the user to put input a number then stores the input in variable firstNumber
        System.out.print("Enter second number: ");
        int secondNumber = inputNumber.nextInt();
// the two lines above asks the user to put input a number then stores the input in variable secondNumber
        int result = firstNumber * secondNumber;
// this multiplies the two inputs in the variables and stores in the result variable
        System.out.println("The result is: " + result);
        inputNumber.close();
// the two lines above prints out the result and then closes the scanner function

    }
}
