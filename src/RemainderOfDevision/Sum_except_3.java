package RemainderOfDevision;

//Calculate the sum of all numbers from 1 to 100, excluding numbers that are divisible by 3 without a remainder.
public class Sum_except_3 {
    public static void main(String[] args) {
        int sum = 0; // Create a variable to store the sum of numbers
        int number = 1; // Start with the first number (1)

        // Run a loop to iterate over numbers from 1 to 100
        while (number <= 100) {
            if (number % 3 == 0) { // Check if the current number is divisible by 3 without remainder
                number++; // If yes, move to the next number
                continue; // Use the continue statement to skip the rest of the code and move to the next iteration of the loop
            }
            sum += number; // If the number is not divisible by 3 without remainder, add it to the sum
            number++; // Move to the next number
        }

        System.out.println(sum); // Print the total sum of numbers not divisible by 3
    }
}
