/*
Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100

*/
public class FibonacciSequence {
    public static void main(String[] args) {
        int m = 100;
        generateFibonacciSequence(m);
    }

    // Method to generate Fibonacci sequence up to  100
    public static void generateFibonacciSequence(int m) {
        int x = 0;
        int y = 1;
        int z;

        System.out.println("Fibonacci Sequence up to " + m + ":");

        // Print the first number in the sequence
        System.out.print(x + " ");

        // Generate and print the subsequent Fibonacci numbers
        while (y <= m) {
            System.out.print(y + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}

