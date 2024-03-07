package OperationsWithdData;
import java.util.Scanner;

/* Write a program that reads three strings and outputs them in the reverse order, each on a new line.

Example of output:

Input text:
my
first
program

Output text:
program
first
my
 */

public class StringsInReverseOrder {
    public static void main(String[] args) {
        String firstString;
        String secondString;
        String thirdString;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        secondString = scanner.nextLine();

        System.out.println("Enter the third string:");
        thirdString = scanner.nextLine();

        scanner.close();

        System.out.println("Strings in reverse order:");
        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);
    }
}
