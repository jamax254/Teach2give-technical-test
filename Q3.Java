/*
Question 3: Power of Two
Write a program that takes an integer as input and returns true if the input is a power of two.

Examples:
8=> returns true
6=> returns false
*/
import java.util.Scanner;

public class PowerOfTwo 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // Read an integer from the user
        int number = scanner.nextInt();
        // Check if the entered number is a power of two then store the result
        boolean result = isPowerOfTwo(number);
        //  To print the result
        System.out.println("Result: " + result);
    }

    // Method to check if a given integer is a power of two
    private static boolean isPowerOfTwo(int number)
    {
        //The handle edge cases: negative numbers and zero are not powers of two
        if (number <= 0) 
        {
            return false;
        }
        /* If a number is a power of two, it will have only one bit set in its binary representation
        So, if we subtract 1 from a power of two, all bits to the right of the only set bit will become 1
      and ANDing the original number and original number - 1 should result in 0
        */ 
        return (number & (number - 1)) == 0;
    }
}
