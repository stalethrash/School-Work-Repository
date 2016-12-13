/*
 * Mitch Meyer
 * 2/23/2016
 * Assignment 7.1
 * Bellevue University
 * DomesticDivision.java
 */
package DomesticDivision;
import Division.*;

public class DomesticDivision extends Division 
    {
    
    private String state;
    
    public DomesticDivision(String namePub, int accountNumPub, String statePub)
        {
        super(namePub, accountNumPub);
        state = statePub;
        
        }
    
    @Override
    public void display()
    {
        System.out.println("Div Name: " + this.getName());
        System.out.println("Div #: " + this.getAccountNum());
        System.out.println("Div State: " + state);
        System.out.println("\n\n");
    }
    }
