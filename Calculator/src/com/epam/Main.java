package com.epam;

import java.util.Scanner;

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

    /**
     * Returns the value of the first two attributes depending on the third attribute
     *
     * @param firstNumber   the first value
     * @param secondNumber   the second value
     * @param operation the math symbol
     * @return the result
     */
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
