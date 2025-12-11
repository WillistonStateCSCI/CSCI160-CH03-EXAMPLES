/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

// ***** 1. add your import statements here
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    // Your code goes here
    Scanner scan = new Scanner( System.in );
    System.out.print( "Please enter your first name > " );
    String firstName = scan.next( ); 
       
    System.out.println( "Hello" );
    int len = firstName.length( );
    System.out.println( firstName + " has " + len + " letters" );   
       
    //*****
    // 3.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Declare a constant for the current year.
    //     c. Calculate and print the age the user will be this year.
    //     d. Declare a constant for average life expectancy,
    //            set its value to 78.94.
    //     e. Calculate and print the percentage
    //            of the user's expected life they've lived.
    //        Use the DecimalFormat class to format the percentage 
    //            to one decimal place
    // your code goes here
    System.out.print( "\nPlease enter the year you were born > " );
    int year = scan.nextInt( ); 
    final int YEAR = 2021; 
    int age = YEAR - year;
    System.out.println( "This year, you will be " + age + " years old" );
    final double EXPECTANCY = 78.94;
    DecimalFormat df = new DecimalFormat( "#.0%" );
    System.out.println( "You have used " + df.format( age / EXPECTANCY ) 
                      + " of your life" );    
    //*****
    // 4.  a. Generate a secret random integer between 1 and 20 (both included)
    //     b. Skip a line, then ask the user for a guess.
    //     c. Print a message telling the user the secret number
    //         and how far from the number the user's guess was 
    //         (hint: use Math.abs)
    // your code goes here
    Random rand = new Random( );
    int number = 1 + rand.nextInt( 20 );
    System.out.println( "\nGuess a number between 1 and 20 > " );
    int guess = scan.nextInt( );
    System.out.println( "The secret number was " + number );
    System.out.println( "You were " + Math.abs( guess - number ) + " from it" );
  }
}