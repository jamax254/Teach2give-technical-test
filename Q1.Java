/*
Question 1: FizzBuzz
Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for 
multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print 
"FizzBuzz".
*/
public class FizzBuzz
  {
    public static void main(String[] args) 
  {
        // Loop from 1 to 100
        for ( int m = 1; m <= 100; m++ )
          {
            if ( m % 3 == 0  &&  m % 5 == 0 ) 
            {
                // If the number is divisible by both 3 and 5, print "FizzBuzz"
                System.out.println("FizzBuzz");
            }
            else if ( m % 3 == 0 )
            {
                // If the number is divisible by 3 only, print "Fizz"
                System.out.println("Fizz");
            } 
            else if ( m % 5 == 0 )
            {
                // If the number is divisible by 5 only, print "Buzz"
                System.out.println("Buzz");
            } 
            else
            {
                // Ifthe number is not divisible by 3 or 5, print the number itself
                System.out.println(m);
            }
        }
    }
}

