/*
 * Mitch Meyer
 * 1/26/2016
 * Assignment 3.1
 * Bellevue University
 * Intermediate Java
 */

import javax.swing.*;


public class Assignment3_1 {

    public static void main(String[] args) {
        
        // Declare variables
        
        String guessOne;
        String guessTwo;
        String guessThree;
        String guessFour;
        
        int gOne;
        int gTwo;
        int gThree;
        int gFour;
        
        int lottoOne = 0 + (int)(Math.random() * (10 + 1));
        int lottoTwo = 0 + (int)(Math.random() * (10 + 1));
        int lottoThree = 0 + (int)(Math.random() * (10 + 1));
        int lottoFour = 0 + (int)(Math.random() * (10 + 1));
        
        int correctCount = 0;
        
        // Prompt user for guesses
        
        guessOne = JOptionPane.showInputDialog(null, "First Guess\nEnter a whole" 
                + " number guess between 0 and 9.");
        guessTwo = JOptionPane.showInputDialog(null, "Second Guess\nEnter a whole" 
                + " number guess between 0 and 9.");
        guessThree = JOptionPane.showInputDialog(null, "Third Guess\nEnter a whole" 
                + " number guess between 0 and 9.");
        guessFour = JOptionPane.showInputDialog(null, "Fourth Guess\nEnter a whole" 
                + " number guess between 0 and 9.");
        
        // Cast guesses to int
        gOne = Integer.parseInt(guessOne);
        gTwo = Integer.parseInt(guessTwo);
        gThree = Integer.parseInt(guessThree);
        gFour = Integer.parseInt(guessFour);
        
        // Compare values
        
        if(gOne == lottoOne)
            correctCount++;
        if(gTwo == lottoTwo)
            correctCount++;
        if(gThree == lottoThree)
            correctCount++;
        if(gFour == lottoFour)
            correctCount++;
           
        // Display results
        if(correctCount == 0)
            JOptionPane.showMessageDialog(null, "Guesses: " + gOne + " , " + gTwo 
                    + " , " + gThree + " , " + gFour + "\nActual: " + lottoOne + " , " 
                    + lottoTwo + " , " + lottoThree + " , " + lottoFour 
                    + "\nZero correct guesses: 0 points.");
        if(correctCount == 1)
            JOptionPane.showMessageDialog(null, "Guesses: " + gOne + " , " + gTwo 
                    + " , " + gThree + " , " + gFour + "\nActual: " + lottoOne + " , " 
                    + lottoTwo + " , " + lottoThree + " , " + lottoFour 
                    + "\nOne correct guess: 5 points");
        if(correctCount == 2)
            JOptionPane.showMessageDialog(null, "Guesses: " + gOne + " , " + gTwo 
                    + " , " + gThree + " , " + gFour + "\nActual: " + lottoOne + " , " 
                    + lottoTwo + " , " + lottoThree + " , " + lottoFour 
                    + "\nTwo correct guesses: 100 points");
        if(correctCount == 3)
            JOptionPane.showMessageDialog(null, "Guesses: " + gOne + " , " + gTwo 
                    + " , " + gThree + " , " + gFour + "\nActual: " + lottoOne + " , " 
                    + lottoTwo + " , " + lottoThree + " , " + lottoFour 
                    + "\nThree correct guesses: 2,000 points");
        if(correctCount == 4)
            JOptionPane.showMessageDialog(null, "Guesses: " + gOne + " , " + gTwo 
                    + " , " + gThree + " , " + gFour + "\nActual: " + lottoOne + " , " 
                    + lottoTwo + " , " + lottoThree + " , " + lottoFour 
                    + "\nAll guesses correct: 1,000,000 points!");
        
        System.exit(0);
      
    }
    
}
