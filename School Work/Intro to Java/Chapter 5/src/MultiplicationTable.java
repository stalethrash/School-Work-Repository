/*
 * Mitch Meyer
 * 4/21/15
 * Listing 5.6
 * Bellevue University
 * MulitplicationTable.java
 */

public class MultiplicationTable {
    public static void main(String[] args){
        // Display the table heading
        System.out.println("         Multiplication Table");
        
        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
          System.out.print("   " + j);
          
        System.out.println("\n-----------------------------------------------");
        
        // Display tabe body
        for (int i = 1; i <= 9; i++){
            System.out.print(i + " | ");
            for (int k = 1; k <= 9; k++){
                // Display the product and align properly
                System.out.printf("%4d", i * k);
                }
            System.out.println();            
        }
    }
}
