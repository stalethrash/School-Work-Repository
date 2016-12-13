/*
 * Mitch Meyer
 * 4/25/15
 * Assignment 5.2
 * Bellevue University
 * Assignement_5_2.java
 */


public class Assignment_5_2 {
    public static void main(String[] args){
        // Display Table header
        System.out.println("  Number  " + "           " + " SquareRoot ");
        System.out.println("----------------------------------");
        
        double root = 0; // define variable to display square root
        
        for (int count = 0; count <= 20; count++){ 
            // for loop generates table 0 to 20 even numbers only
            if (count % 2 == 0){ // statment ensures only even numbers displayed
                root = Math.sqrt(count);  // performs square root function of count            
                System.out.printf("%6d%10c%16.4f\n", count,'|',root);
                // Displays table in asthetically pleasing format
            }            
        } 
    }
}    

