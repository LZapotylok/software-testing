package com.epam;

import java.util.Scanner;

/**
 * Created by olga.zapotylok on 12.09.2018 in 01:11.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Please, enter the second number: ");
        double secondNumber = scanner.nextDouble();

        for (; ; ) {
            System.out.println(
                    "Select operation:"
                            + " +, -, *, / (enter 'exit' to exit)");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                break;
            }
            System.out.println(calculate(firstNumber, secondNumber, operation));
        }
    }

    public static String calculate(double firstNumber, double secondNumber, String operation) {
        String result = "Result is: ";
        if (operation.equals("+")) {
            result += firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result += firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result += firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result += secondNumber != 0 ? firstNumber / secondNumber : "Dividing by zero is undefined";
        } else {
            result += "invalid data, try again";
        }
        return result;
    }
}
