/*
 * Mitch Meyer
 * 5/12/15
 * Assignment 7.2
 * Bellevue University
 * Assignment_7_2.java
 */


public class Assignment_7_2 {
    public static void main(String[] args){
        // Create an int array
        int[] array = new int[10];
        
        // Fill array with random numbers
        for (int i = 0; i < (array.length - 1); i++){
            array[i] = (int)(Math.random() * 100);
        }
        
        // Print the array
        System.out.print("The contents of the arrray are: ");
        for (int i = 0; i < (array.length - 1); i++)
            System.out.print(array[i] + " ");
    }    
}
