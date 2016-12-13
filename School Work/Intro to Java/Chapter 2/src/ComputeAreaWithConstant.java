/* Mitch Meyer
 * Listing 2.4
 * 4/3/15
 * Bellevue University
 * ComputeAreaWithConstant.java
 */

import java.util.Scanner; // Scanner is in th java.util package

public class ComputeAreaWithConstant {
    public static void main(String [] args) {
        final double PI = 3.14159; // Declare a constant
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute area
        double area = radius * radius * PI;
        
        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
