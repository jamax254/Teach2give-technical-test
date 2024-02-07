*
Question 4: Capitalize Words
Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.
Examples:

"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming"
*/
import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read user input
        String input = scanner.nextLine();
        // Call the method to capitalize words and store the result
        String result = capitalizeWords(input);
        // Print the result
        System.out.println("Result: " + result);
    }

    // Method to capitalize the first letter of each word in the input string
    private static String capitalizeWords(String input) 
    {
        // Initialize a StringBuilder to store the modified string
        StringBuilder sb = new StringBuilder(input.length());
        // Flag to indicate if the next character needs to be capitalized
        boolean capitalizeNext = true;
        // Iterate through each character in the input string
        for (int m = 0; m < input.length(); m++)
        {
            char b = input.charAt(m);
            // If the character is a whitespace, set the flag to true
            if (Character.isWhitespace(b))
            {
                capitalizeNext = true;
            } 
            // If the flag is true, capitalize the character and set the flag to false
            else if (capitalizeNext)
            {
                b = Character.toUpperCase(b);
                capitalizeNext = false;
            } 
            // If the flag is false, convert the character to lowercase
            else 
            {
                b = Character.toLowerCase(b);
            }
            // Append the modified character to the StringBuilder
            sb.append(b);
        }
        // Convert StringBuilder to String and return
        return sb.toString();
    }
}
