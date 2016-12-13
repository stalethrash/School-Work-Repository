/*
 * Mitch Meyer
 * 5/19/15
 * Assignment 8.2
 * Bellevue University
 * Assignment_8_2.java
 */

import java.util.Scanner;

public class Assignment_8_2 {
    public static void main(String[] args){
        // Define a variable for a user defined array length
        int arraySize = 0;        
        // Prompt user to define arraySize
        System.out.println("Please enter integer amount of quantities "  
                + "to be sorted: ");                
        // Create a new scanner
        Scanner input = new Scanner(System.in);
        // Receive user input to define arraySize
        arraySize = input.nextInt();
        
        // Allocate an array to be defined by the user
        double [] userArray = new double[arraySize];
        
        // Prompt user to input array values
        System.out.println("Enter " + arraySize + " values: ");
        for (int i = 0; i < userArray.length; i++){
            userArray[i] = input.nextDouble();
        }
        // Apply bubbleSort method to userArray
        bubbleSort(userArray);
        
        // Display the sorted array
        printArray(userArray);
                  
        
    }    
        
    // Create a method for sorting array, smallest to largest
    public static void bubbleSort(double[] userArray){
        boolean changed;
        
        do {
            
            changed = false;
            
            for (int i = 0; i < userArray.length -1; i++){
                if (userArray[i] > userArray[i + 1]){
                    double temp = 0;
                    temp = userArray[i];
                    userArray[i] = userArray[i + 1];
                    userArray[i +1 ] = temp;
                    changed = true;
                }
            }
        }while(changed);
    }
    
    // Create a method to display the array
    public static void printArray(double[] userArray){
        for (int i = 0; i < userArray.length; i++){
            System.out.print(userArray[i] + " ");
        }
    }
    
}
