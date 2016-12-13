/*
 * Mitch Meyer
 * 2/23/2016
 * Assignment 7.1
 * Bellevue University
 * UseDivision.java
 */
package usedivision;
import InternationalDivision.*;
import DomesticDivision.*;

public class UseDivision {

    public static void main(String[] args) {
        
        DomesticDivision emerging = new DomesticDivision("emerging", 1037438, "Nebraska");
        DomesticDivision traders = new DomesticDivision("traders", 1048652, "Nebraska");
        InternationalDivision foreignBonds = new InternationalDivision("foreignBonds", 3052890, "Germany", "German");
        InternationalDivision forexMarkets = new InternationalDivision("forex", 8902895, "England", "English");
        
        emerging.display();
        traders.display();
        foreignBonds.display();
        forexMarkets.display();    
    }    
}
