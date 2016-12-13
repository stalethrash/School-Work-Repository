/*
 * Mitch Meyer
 * 4/21/15
 * Listing 4.4
 * Bellevue University
 * HexDigit2Dec.java
 */

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();
        
        // Check if hex string has exactly one character
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
            }
        
        // Display decimal value for the hex digit
        char ch = hexString.charAt(0);
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " 
            + ch + " is " + ch);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
