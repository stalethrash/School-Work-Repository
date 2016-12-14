/*
 * Mitch Meyer
 * 2/23/2016
 * Assignment 7.1
 * Bellevue University
 * InternationalDivision.java
 */
package InternationalDivision;
import Division.*;


public class InternationalDivision extends Division 
{
    private String country;
    private String language;
    
    
    public InternationalDivision(String namePub, int accountNumPub, String countryPub, String langPub){
        super(namePub, accountNumPub);    
        country = countryPub;
        language = langPub;
        
    }
    
    @Override
    public void display(){
        System.out.println("Div Name: " + this.getName());
        System.out.println("Div #: " + this.getAccountNum());
        System.out.println("Div Country: " + country);
        System.out.println("Div Lang: " + language);
        System.out.println("\n\n");        
    }
    
}
