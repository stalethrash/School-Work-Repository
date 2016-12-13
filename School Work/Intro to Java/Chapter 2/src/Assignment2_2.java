/* Mitch Meyer
 * Convert Fahrenheit to Celsius
 * 4/5/15
 * Bellevue University
 * Assignment2_2.java
 */

import java.util.Scanner;

// Imports the scanner utility to allow data input from the user.

public class Assignment2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creates a Scanner object to be used for input
        
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        /* Prompts user to enter variable value and the Scanner object to assign
        user entered value to variable fahrenheit. */
        
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
        
        // Calculates celsius and displays on the console.
    }
}
