package OperationsWithdData;
import java.util.Scanner;

//Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".

public class ReadOutputData {
    public static void main(String[] args) {
        String answer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you?");

        answer = scanner.nextLine();

        scanner.close();

        System.out.println("You are " + answer);
    }
}
