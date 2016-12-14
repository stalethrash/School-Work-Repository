/*
 * Mitch Meyer
 * 2/23/2016
 * Assignment 7.1
 * Bellevue University
 * Division.java
 */
package Division;


public abstract class Division 
{
    private String name;
    private int accountNum;
    
    public abstract void display();
    
    public Division(String namePub, int accountNumPub){
        name = namePub;
        accountNum = accountNumPub;
    }
    public String getName()
    {
        return name;
    }
    
    public void setName(String divName)
    {
        name = divName;
    }
    
    public int getAccountNum()
    {
        return accountNum;
    }
    
    public void setAccountNum(int actNum)
    {
        accountNum = actNum;
    }
}
