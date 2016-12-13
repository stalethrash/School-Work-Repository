/*
 * Mitch Meyer
 * 4/12/15
 * Purpose: determine if an integer is even
 * Bellevue University
 * Assignment_2_3.java
 */

import java.util.Scanner;

public class Assignment_2_3 {
    public static void main(String[] args){
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Receive user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Define variable to be tested
        
        // Check if number is even
        boolean isEven = (number % 2 == 0);
        
        // Display result
        System.out.println(number + " is even? " + isEven);
    }
}
