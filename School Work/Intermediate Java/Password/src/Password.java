/*
 * Mitch Meyer
 * 2/2/2016
 * Assignment 4.1
 * Bellevue University
 * Password.java
 */

import javax.swing.*;

public class Password {
    
    public static void main(String[] args){
        String result1 = "Valid Password";
                
        String pass1 = JOptionPane.showInputDialog(null, "Enter a password. Must" 
                + " be\n between 6 and 10 characters, \nand contain at least one letter " 
                + "\nand one number.");      
       
        // Run password Check
        
        String pass1Check = passwordCheck(pass1);
        
        if(pass1Check.equals(result1)){
            String pass2 = JOptionPane.showInputDialog(null, "Valid password. " 
                    + "Please re-enter the password.");
            if(pass2.equals(pass1)){
                JOptionPane.showMessageDialog(null, "Passwords match. Thank you.");
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Passwords do not match, try again");
                main(args);
            }            
        }
        else{
            JOptionPane.showMessageDialog(null, pass1Check);
            main(args);
            }        
    }
        public static String passwordCheck(String Password){
            
            String result = "Valid Password";			
	    int length = 0;								
	    int numCount = 0;							
	    int lettCount = 0;							


		for (int x =0; x < Password.length(); x++) {

			if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {		// Counts the number of numbers
                            numCount ++;
			}
			if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {		
                            lettCount++;
			}
                        if ((Password.charAt(x) > 96 && Password.charAt(x) < 123)) {
                            lettCount++;
                        }
			length = (x + 1);										// Counts the passwords length

		}

		if (numCount < 1){											// Checks that password contains two numbers
                    result = "Not enough numbers in password!";
		}

		if (lettCount < 1) {											// Checks that password contains two capital letters
                    result = "Not enough letters in password!";
		}

		if (length < 6){											// Checks that password is long enough
                    result = "Password is too short!";
		}
                if (length > 10){
                    result = "Password is too long!";
                }

			return (result);										// Returns the value of "result"

	}
} 
    

