/*
Question 5: Reverse Integer

Write a program that takes an integer as input and returns an integer with reversed digit
ordering.
Examples:

For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19.
*/
import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args)
    {
        // This is a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        // Read the integer input provided by the user
        int number = scanner.nextInt();
        // Call the reverseInteger method to reverse the digits of the input number
        int reversedNumber = reverseInteger(number);
        // Print the reversed number to the console
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse the digits of an integer
    private static int reverseInteger(int number) 
    {
        // Initialize a variable to store the reversed number
        int reversedNumber = 0;
        // Extract digits from the input number one by one and build the reversed number
        while (number != 0)
        {
            // Extract the last digit of the number
            int digit = number % 10;
            // Append the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            // Remove the last digit from the number
            number /= 10;
        }
        // Return the reversed number
        return reversedNumber;
    }
}
