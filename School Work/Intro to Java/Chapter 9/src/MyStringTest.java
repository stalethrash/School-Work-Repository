/*
 * Mitch Meyer
 * 5/25/15
 * Assignment 9.4
 * Create an instance of the String class and initializes this instance with a 
 * String literal. Use a for loop structure to print the string in reverse order
 * Bellevue University
 * MyStringTest.java
 */

import java.util.Scanner;

public class MyStringTest {
    // Main method 
    public static void main(String[] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
               
        // Prompt user to enter string to be reversed
        System.out.println("Please enter a string to be reversed: ");
        
        // Create a String variable to be defined by the user
        String stringTest = input.nextLine();
        
        // Initialize reverse variable to store reversed string
        String reverse = "";
        int length = stringTest.length();
        
        // Create loop to read entered string and reverse it
        for (int i = length; i > 0; i-- ){
            reverse = reverse + stringTest.charAt(i - 1);
        }
        
        // Display reversed string
        System.out.println("You entered: " + stringTest);
        System.out.println("The reverse is : " + reverse);
        
    }
}    

