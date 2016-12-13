/*
 * Mitch Meyer
 * 2/16/2016
 * Assignment 6.1
 * Bellevue University
 * ClassRoster.java
 */

import student.*;
import java.util.*;

public class ClassRoster {
    
    public static void main(String[] args) {
        
        // Initialize student object array
        List<Student> roster = new LinkedList<Student>();
        
        String temp = null;
        
        // Add students to array
        for(int i = 0; i < 20; i++){
            if(i == 0)
                roster.add(new Student("Akinmoladun", "Freedom", 91));
            else if(i == 1)
                roster.add(new Student("Alston", "Lavan", 3 ));
            else if(i == 2)
                roster.add(new Student("Anderson", "Avery", 4));
            else if(i == 3)
                roster.add(new Student("Anderson", "Fyn", 75));
            else if(i == 4)
                roster.add(new Student("Armstrong Jr.", "Tommy", 4));
            else if(i == 5)
                roster.add(new Student("Banderas", "Josh", 52));
            else if(i == 6)
                roster.add(new Student("Barnett", "Jalin", 74));
            else if(i == 7)
                roster.add(new Student("Barry", "Mohamed", 18));
            else if(i == 8)
                roster.add(new Student("Brown", "Drew", 34));
            else if(i == 9)
                roster.add(new Student("Brugmann", "Jared", 51));
            else if(i == 10)
                roster.add(new Student("Carter", "Cethan", 11));
            else if(i == 11)
                roster.add(new Student("Cotton", "Sam", 84));
            else if(i == 12)
                roster.add(new Student("Davis", "Khalil", 94));
            else if(i == 13)
                roster.add(new Student("Foltz", "Sam", 27));
            else if(i == 14)
                roster.add(new Student("Gates", "Nick", 68));
            else if(i == 15)
                roster.add(new Student("Gerry", "Nate", 25));
            else if(i == 16)
                roster.add(new Student("Hemphill", "Austin", 49));
            else if(i == 17)
                roster.add(new Student("Kalu", "Joshua", 10));
            else if(i == 18)
                roster.add(new Student("McMullen", "Greg", 90));
            else
                roster.add(new Student("Moore", "Alonzo", 82));                   
        }
        
        for(int i = 0; i < roster.size(); i++){
            System.out.println(roster.get(i).newToString());
            }
        
        System.out.println("");
        
        for(int i = 19; i >= 0; i--){
            System.out.println(roster.get(i).newToString());
        }
    }
    
}
