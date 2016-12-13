package assignment.pkg2_2;

/*
 * Mitch Meyer
 * 1/19/2016
 * Assignment 2.2
 * Bellevue University
 * CollegeStudent.java
 */
import Student.*;
import java.util.GregorianCalendar;
import javax.swing.*;


public class TestCollegeStudent {
    
    public static void main (String args []){
        
        String fName;
        String lName;
        String enrollDay;
        String enrollMonth;
        String enrollYear;
        int eDay;
        int eMonth;
        int eYear;
        int gradYear;
        
        
        fName = JOptionPane.showInputDialog(null, "Enter first name of " 
                + "new college student.");
        lName = JOptionPane.showInputDialog(null, "Enter last name of " 
                + "new college student.");
        enrollDay = JOptionPane.showInputDialog(null, "Enter day of enrollment.");
        enrollMonth = JOptionPane.showInputDialog(null,"Enter month of enrollment.");
        enrollYear = JOptionPane.showInputDialog(null,"Enter year of enrollment.");
        
        eDay = Integer.parseInt(enrollDay);
        eMonth = Integer.parseInt(enrollMonth);
        eYear = Integer.parseInt(enrollYear);
        gradYear = Integer.parseInt(enrollYear) + 4;
        
        GregorianCalendar enroll = new GregorianCalendar();
        GregorianCalendar graduate = new GregorianCalendar();
        
        enroll.setLenient(false);
        graduate.setLenient(false);
        
        enroll.set(GregorianCalendar.YEAR, eYear);
        enroll.set(GregorianCalendar.MONTH, eMonth);
        enroll.set(GregorianCalendar.DATE, eDay);
        
        graduate.set(GregorianCalendar.YEAR, gradYear);
        graduate.set(GregorianCalendar.MONTH, eMonth);
        graduate.set(GregorianCalendar.DATE, eDay);
        
        CollegeStudent student1 = new CollegeStudent(fName, lName, enroll, graduate);
        
        JOptionPane.showMessageDialog(null, "First student entered.");
        
        fName = JOptionPane.showInputDialog(null, "Enter first name of second" 
                + "new college student.");
        lName = JOptionPane.showInputDialog(null, "Enter last name of second" 
                + "new college student.");
        enrollDay = JOptionPane.showInputDialog(null, "Enter day of enrollment.");
        enrollMonth = JOptionPane.showInputDialog(null,"Enter month of enrollment.");
        enrollYear = JOptionPane.showInputDialog(null,"Enter year of enrollment.");
        
        eDay = Integer.parseInt(enrollDay);
        eMonth = Integer.parseInt(enrollMonth);
        eYear = Integer.parseInt(enrollYear);
        gradYear = Integer.parseInt(enrollYear) + 4;
        
        enroll.set(GregorianCalendar.YEAR, eYear);
        enroll.set(GregorianCalendar.MONTH, eMonth);
        enroll.set(GregorianCalendar.DATE, eDay);
        
        graduate.set(GregorianCalendar.YEAR, gradYear);
        graduate.set(GregorianCalendar.MONTH, eMonth);
        
        graduate.set(GregorianCalendar.DATE, eDay);
        
        CollegeStudent student2 = new CollegeStudent(fName, lName, enroll, graduate);
        
        JOptionPane.showMessageDialog(null, "Second student entered.");
        JOptionPane.showMessageDialog(null, "Student1:\nFirst Name: " 
                + student1.getFirstName() + "\nLastName: " + student1.getLastName() 
                + "\nEnroll Date: " + student1.getEnrollDate() + "\nGraduation Date: " 
                + student1.getGradDate() + "\n\nStudent2:\nFirst Name: " +
                student2.getFirstName() + "\nLast Name: " + student2.getLastName() 
                + "\nEnroll Date: " + student2.getEnrollDate() + "\nGraduation Date: " 
                + student2.getGradDate());
                
    }
    
}
