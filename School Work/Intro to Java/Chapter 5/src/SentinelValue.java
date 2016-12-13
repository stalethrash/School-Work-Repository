/*
 * Mitch Meyer
 * 4/21/15
 * Listing 5.5
 * Bellevue University
 * SentinelValue.java
 */

import java.util.Scanner;

public class SentinelValue {
    /** Main method */
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Read initial data
        System.out.print( 
            "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        
        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0){
            sum += data;
            
            // Read the next data
            System.out.print(
                "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();            
        }
        
        System.out.println("The sum is " + sum);
    }
}
