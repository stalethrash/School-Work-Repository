/*
 * Mitch Meyer
 * 4/21/15
 * Assignment 4.3
 * Bellevue University
 * Assignment_4_3.java
 */


public class Assignment_4_3 {
    public static void main(String[] args){
        // initialize sum variable
        int sum = 0;
        // set loop to add odd numbers 1 through 15
        for(int count = 1; count <= 15; count++){
            if (count % 2 != 0){
                sum += count;                
            }            
        }
        // Display total
        System.out.println("The sum total of the odd numbers between\n"
                + "1 and 15 is " + sum);
        // Display average
        System.out.println("The average of the odd numbers between\n" +
                    "1 and 15 is " + (sum / 8));
    }
}
