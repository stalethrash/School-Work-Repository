/* Mitch Meyer
 * Compute energy needed to heat water
 * 4/3/15
 * Bellevue University
 * Assignment_2_01.java
 */

import java.util.Scanner;

public class Assignment_2_01 {
   public static void main(String[] args){
   
   // Create new scanner object
   Scanner input = new Scanner(System.in);
   
   // Prompt user to enter a value for amount of water in kilograms
   System.out.print("Enter an amount of water in kilograms: ");
   double waterkg = input.nextDouble();
   
   // Prompt user to enter inital temperature of water
   System.out.print("Enter an initial water temperature in celsius: ");
   double initialTemperature = input.nextLong();
   
   // Prompt user to enter final temperature of water
   System.out.print("Enter a final water temperature in celsius: ");
   double finalTemperature = input.nextDouble();
   
   // Calculate needed energy to increase water temperature
   double energyJoules = waterKg * (finalTemperature - initialTemperature) 
           * 4184;
   
   // Output results to the console.
   System.out.println("The amount of energy needed in Joules to increase " +
           waterkg + " kg of water from " + initialTemperature + 
           " degrees celsius to " + finalTemperature + " degrees celsius is " +
           energyJoules + " Joules.");
    }
}
