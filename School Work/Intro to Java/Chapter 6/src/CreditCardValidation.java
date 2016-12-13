/**
 * Mitch Meyer
 * 4/25/15
 * Assignment 5.1
 * Bellevue University
 * CreditCardValidation.java
 */

import java.util.Scanner;

public class CreditCardValidation {
    /* Main method */
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        long number = 0;
        // Prompt the user to enter a credit card number
        System.out.println("Enter a credit card number, without spaces, to be " 
                + "validated:\n");
        number = input.nextLong();
        
        isValid(number);
    }
    
    /** Return true if the card number is valid */
    public static boolean isValid(long number){        
        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 &&
                prefixMatched(number, 1) == true){
            System.out.println("The entered credit card number is valid.");
            return true;
        }    
        else{
            System.out.println("The entered credit card number is invalid.");
            return false;
        }
    }
    
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        long temp = 0;
        
        while (number > 0){
            temp = number % 100;
            sum += getDigit((int)(temp / 10) * 2);
            number = number / 100;
        }
        return sum;
    }
    
    /** Return this number if it is a single digit, otherwise 
     * return the sum of the two digits */
    public static int getDigit(int number){
        if (number <= 9)
            return number;
        else{ 
            int digit1 = number % 10;
            int digit2 = number / 10;
                
            return digit1 + digit2;
        }
    }    
    
    /* Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int sum = 0;
        long temp = 0;
        
        while (number > 0){
            temp = number % 100;
            sum += temp;
            number = number / 100;
        }
        return sum;
    }
    
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        d = 1;
        
        if (getPrefix(number, d) == 4 || getPrefix(number, d) == 5 || 
                getPrefix(number, d) == 6){
            if (getSize(number) <= 16 && getSize(number) >= 13)
                return true;
        }
        if (getPrefix(number, d) == 3){
            d = 2;
            if(getPrefix(number, d) == 37){
                if (getSize(number) <= 16 && getSize(number) >= 13)
                    return true;
            }                
        }
        return false;
    }
    
    /** Return the number of digits in d */
    public static int getSize(long d){
      
        int count = 0;
        
        while (d > 0){
            d = d / 10;
            
            count++;
        }
      return count;
        
                
    }
    
    /** Return the first k number of digits from number. If the 
     *  number of digits in number is less than k, return number.*/
    public static long getPrefix(long number, int k){
        if (getSize(number) < k){
            return number;
        }
        else{
            
            int size = (int)getSize(number);
            
            for (int i = 0; i < (size - k); i++){
                number = number / 10;
            }
            return number;
        }
    }
}
    
