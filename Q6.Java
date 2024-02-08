/*
Question 6: Count Vowels
Write a program that counts the number of vowels in a sentence.

eg " Hello World " => returns 2
*/
// Import the Scanner class from the java.util package to read input from the user
import java.util.Scanner;

public class CountVowels{

    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        // Read the input sentence provided by the user
        String sentence = scanner.nextLine();
        // Call the countVowels method to count the number of vowels in the sentence
        int vowelCount = countVowels(sentence);
        // Print the number of vowels to the console
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to count the number of vowels in a given sentence
    private static int countVowels(String sentence)
    {
        // Convert the sentence to lowercase to simplify vowel detection
        sentence = sentence.toLowerCase();
        // Initialize a variable to store the count of vowels
        int count = 0;
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++)
        {
            // Get the current character
            char ch = sentence.charAt(i);
            // Check if the current character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // If the current character is a vowel, increment the count
                count++;
            }
        }
        // Return the total count of vowels in the sentence
        return count;
    }
}
