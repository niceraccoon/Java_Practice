package OperationsWithdData;

import java.util.Scanner;

public class MultiplyingTwoNumbers {
        public static long multiply(int first, int second) {
            return (long) first *second;
        }
        public static void main(String[] args) {
            int firstNumber;
            int secondNumber;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number:");
            firstNumber = scanner.nextInt();

            System.out.println("Enter the second number:");
            secondNumber = scanner.nextInt();

            scanner.close();

            System.out.println("Result of multiplying two numbers: " + multiply(firstNumber, secondNumber));
        }
}
