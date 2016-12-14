/*
 * Mitch Meyer
 * 1/19/2016
 * Assignment 2.1
 * Bellevue University
 * Intermediate Java
 */
import javax.swing.*;

public class Exponent {
    
    private double dblInput;
    
    private void setInput(double input){
        
        dblInput = input;
    }
    
     public double getSquare(double dblInput){
        
        double sqrInput = (dblInput * dblInput);
        return sqrInput;
    
}
    public double getCube(double dblInput){
        
        double cubeInput = (dblInput * dblInput * dblInput);
        return cubeInput;
    }

  
    public static void main(String[] args) {
        
        Exponent x = new Exponent();
        // Declare variables
        double dblInput;
        double sqrDouble;
        double cubeDouble;
        String rawInput;
        
        // Prompt user for input
        rawInput = JOptionPane.showInputDialog(null, "Enter a numeric value\n"
                + " Example: 3.1459 ");
        // Store input as a double
        dblInput = Double.parseDouble(rawInput);
        x.setInput(dblInput);
                
        // Pass input through methods to determine square and cube
        sqrDouble = x.getSquare(dblInput);
        cubeDouble = x.getCube(dblInput);
        
        
        
        JOptionPane.showMessageDialog(null, "The square of " + dblInput 
                + " is: " + sqrDouble + "\nThe cube of " + dblInput 
                + " is: " + cubeDouble);
      
        //Close Program
        System.exit(0);
    }
    
   
    
}
