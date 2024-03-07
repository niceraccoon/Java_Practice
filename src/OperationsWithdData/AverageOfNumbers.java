package OperationsWithdData;
import java.util.Scanner;

/* Write a program that takes three numbers from console as input to calculate and print output the average of the numbers.

Example of output:

First number - 6
Second number - 4
Third number - 7

Average - 5.6666665
 */

public class AverageOfNumbers {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number:");
        secondNumber = scanner.nextDouble();

        System.out.println("Enter the third number:");
        thirdNumber = scanner.nextDouble();

        scanner.close();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of the three numbers is: " + average);
    }
}
