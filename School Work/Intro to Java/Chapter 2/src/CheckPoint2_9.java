/* Mitch Meyer
 * Check Point 2.9
 * 4/3/15
 * Bellevue University
 * CheckPoint2_9.java
 */

public class CheckPoint2_9 {
    public static void main(String [] args) {
        
        // Declare a double variable named miles with initial value of 100
        double miles = 100;
        
        // Declare a double constant named KILOMETERS_PER_MILE with value 1.609
        final double KILOMETERS_PER_MILE = 1.609;
        
        // Declare a double variable named kilometers, mulitply miles and
        // KILOMETERS_PER_MILE, and assign the results to kilometers.
        
        double kilometers = miles * KILOMETERS_PER_MILE;
        
        // Display kilometers on the console.
        
        System.out.println(kilometers);
    }
}
