/*
 * Mitch Meyer
 * 2/16/2016
 * Assignment 6.1
 * Bellevue University
 * Student.java
 */
package student;

public class Student {
    
    public Student(String lastName, String firstName, int studentNum){
        lName = lastName;
        fName = firstName;
        studentId = studentNum;
    }

    private String lName;
    private String fName;
    private int studentId; 
    
    public void setLName(String lastName){
        lName = lastName;
        
    }
    
    public String getLName(){
        return lName;
    }
    
    public void setFName(String firstName){
        fName = firstName;
    }
    
    public String getFName(){
        return fName;
    }
    
    public void setStudentId(int studentNum){
        studentId = studentNum;
    }
    
    public int getStudentId(){
        return studentId;
    }
    
    public String newToString(){
        return "" + lName + ", " + fName + " # " + studentId;
    }
}
