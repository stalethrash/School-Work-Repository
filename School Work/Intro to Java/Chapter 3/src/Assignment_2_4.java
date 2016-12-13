/*
 * Mitch Meyer
 * 4/12/15
 * Sort three entered numbers in ascending order
 * Bellevue University
 * Assignment_3_4.java
 */

import java.util.Scanner;

public class Assignment_2_4 {
    public static void main(String[] args){
        
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter three integers
        System.out.print("Enter three integers to be sorted in ascending order: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Test, sort, and display integers
        if (number1 <= number2 && number2 <= number3)
            System.out.print(number1 + " " + number2 + " " + number3);
        else if (number2 <= number1 && number1 <= number3)
            System.out.print(number2 + " " + number1 + " " + number3);
        else if (number3 <= number1 && number1 <= number2)
            System.out.print(number3 + " " + number1 + " " +number2);
        else if (number3 <= number2 && number2 <= number1)
            System.out.print(number3 + " " + number2 + " " + number1);
        else if (number1 <= number3 && number3 <= number2)
            System.out.print(number1 + " " + number3 + " " + number2);
        else 
            System.out.print(number2 + " " + number3 + " " + number1);
    }
}
