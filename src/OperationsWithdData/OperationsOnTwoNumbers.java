package OperationsWithdData;
import java.util.Scanner;

/* Create Console Application project in Java.
In main() method write code for solving next tasks:
1. Define integer variables a and b. Read values a and b from Console and calculate:
• a + b
• a - b
• a * b
• a / b.
2. Output obtained results.
 */
public class OperationsOnTwoNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        int difference;
        int product;
        int quotient;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer number for a:");
        a = scanner.nextInt();

        System.out.println("Enter the integer number for b:");
        b = scanner.nextInt();

        scanner.close();

        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;

        System.out.println("Sum of the integer numbers a and b: " + sum);
        System.out.println("Difference of the integer numbers a and b: " + difference);
        System.out.println("Product of the integer numbers a and b: " + product);
        System.out.println("Quotient of the integer numbers a and b: " + quotient);
    }
}
