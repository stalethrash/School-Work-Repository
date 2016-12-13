/*
 * Mitch Meyer
 * 5/1/15
 * Assignment 6.2
 * Bellevue University
 * Assignment_6_2.java
 */


public class Assignment_6_2 {
    /** Main method */
    public static void main(String [] args){
        // Invoke the diff method with int parameters
        System.out.println("The difference between 3 and 4 is " 
            + diff(3, 4));
        
        // Invoke the diff method with double parameters
        System.out.println("The difference between 3.0 and 4.0 is " 
            + diff(3.0, 4.0));
        
        // Invoke the diff method with a double parameter and an int parameter
        System.out.println("The difference between 5.4 and 10 is " 
            + diff(5.4, 10));
        
        // Invoke the diff method with an int parameter and a double parameter
        System.out.println("The difference between 10 and 6.2 is " 
            + diff (10, 6.2));
        
    }
    
    
    /** Return the difference of two int values */
    public static int diff(int num1, int num2){
        if (num1 > num2)
            return (num1 - num2);
        else
            return (num2 - num1);                  
    }
    
    /** Find the difference of two double values */
    public static double diff(double num1, double num2){
        if (num1 > num2)
            return (num1 - num2);
        else
            return (num2 - num1);
    }
    
    /** Find the difference of a double value and an int value */
    public static double diff(double num1, int num2){
        if (num1 > num2)
            return (num1 - num2);
        else
            return (num2 - num1);
    }
    
    /** Find the difference of an int value and a double value */
    public static double diff(int num1, double num2){
        if (num1 > num2)
            return (num1 - num2);
        else 
            return (num2 - num1);
    }
}
