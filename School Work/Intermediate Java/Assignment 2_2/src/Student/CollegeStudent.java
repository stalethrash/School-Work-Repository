package Student;

/*
 * Mitch Meyer
 * 1/19/2016
 * Assignment 2.2
 * Bellevue University
 * CollegeStudent.java
 */

import java.util.GregorianCalendar;


public class CollegeStudent{    
   
    public CollegeStudent(String fName, String lName, GregorianCalendar eDate,
            GregorianCalendar gDate){
        firstName = fName;
        lastName = lName;
        enrollDate = eDate;
        gradDate = gDate;
    }
    public CollegeStudent(){
        
    }
    private String firstName;
    private String lastName;
    GregorianCalendar enrollDate = new GregorianCalendar();
    GregorianCalendar gradDate = new GregorianCalendar();
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
    public GregorianCalendar getEnrollDate(){
        return enrollDate;
    }
    public void setEnrollDate(GregorianCalendar eDate){
        enrollDate = eDate;
    }
    public GregorianCalendar getGradDate(){
        return gradDate;
    }
    public void setGradDate(GregorianCalendar gDate){
        gradDate = gDate;
    }
    
}
