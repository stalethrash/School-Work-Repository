/*
 * Mitch Meyer
 * 4/21/15
 * Assignment 4.2
 * Bellevue University
 * Assignment_4_2.java
 */

public class Assignment_4_2 {
    public static void main(String[] args){
       // Initalize variable to contol number of lines
       int line = 1;
       // Initalize variable to control numbers on each line
       int count = 0;
       
       // Create a for loop to increment numbers to be printed on lines
       for(int output = 1; output < 7; output++){
           // if statement starts line based on count and resets output
           if (count == line){
               System.out.println("");
               count = 0;
               line++;
               output = 1;
        }
            /* Uses formated print statement to print incremented output until
            output reaches 7 */
            System.out.printf("%-4d", output);
            count++;
       }
       
       System.out.println("");
       System.out.println("");
       
       line = 7;
       count = 0;
       
       
    for (int space = 0; space < 7; space++){  
        for (int output = 1; output < line; output++){
            if (line == count){
              System.out.println("");
              count = 0;
              output = 1;
              line--;
      }
            else{  
          System.out.printf("%-4d", output);
          count++;
            }
    }
}
    }
}
