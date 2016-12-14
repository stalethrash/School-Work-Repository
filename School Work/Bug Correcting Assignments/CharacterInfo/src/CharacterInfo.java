/*
 * Mitch Meyer
 * 2/2/2016
 * Assignment 4.2 - Buggy Program
 * Bellevue University
 * CharacterInfo
 */

public class CharacterInfo {
    
    public static void main(String [] args){
        char aChar = 'C';
        System.out.println("The character is " + aChar);
        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.print(aChar +  is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        achar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        
        if(Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        e1se
            System.out.println(aChar + " is neither a letter or digit");
        if(Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }
}
