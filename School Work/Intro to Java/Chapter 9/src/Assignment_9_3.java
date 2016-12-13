/*
 * Mitch Meyer
 * 5/24/15
 * Assignment 9.3
 * Bellevue University
 * Assignment_9_3.java
 */


public class Assignment_9_3 {
    /** Main method to test MyRectangle Class */
    public static void main(String[] args){
        
        // Create new default rectangle object
        MyRectangle rectangle1 = new MyRectangle();
        // Display default rectangle objects data field values
        System.out.println("The default parameters of a MyRectangle object "
                + "are:" + "\nHeight: " + rectangle1.getHeight() + "\n" 
                + "Width: " + rectangle1.getWidth() + "\n" + "Color: " 
                + rectangle1.getColor() + "\nArea: " + rectangle1.findArea());
        
        // Create new rectangle object with specified parameters
        MyRectangle rectangle2 = new MyRectangle(4.5, 7.9, "yellow");
        
        // Modify first rectangle per requirements
        rectangle1.setHeight(6.8);
        rectangle1.setWidth(9.0);
        rectangle1.setColor("red");
        
        // Display data fields of modified rectangle1
        System.out.println("The parameters of rectangle1 are: "
                + "\nHeight: " + rectangle1.getHeight() + "\n" 
                + "Width: " + rectangle1.getWidth() + "\n" + "Color: " 
                + rectangle1.getColor() + "\nArea: " + rectangle1.findArea());
        
        // Display data fields of rectangle2
        System.out.println("The parameters of rectangle2 are: "
                + "\nHeight: " + rectangle2.getHeight() + "\n" 
                + "Width: " + rectangle2.getWidth() + "\n" + "Color: " 
                + rectangle2.getColor() + "\nArea: " + rectangle2.findArea());
        
    }              
}
class MyRectangle{
    // Set the default width value    
    private double width = 1.0;
    // Set the default height value
    private double height = 1.0;
    // Set the value of static color variable
    private static String color = "white";
    
    public MyRectangle(){ // Create a default rectangle object
        
    }
    // Create a rectangle object of specified parameters 
    public MyRectangle(double widthParam, double heightParam, String colorParam){
        width = widthParam;
        height = heightParam;
        color = colorParam;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double widthParam){
        width = widthParam;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double heightParam){
        height = heightParam;
    }
    
    public String getColor(){
        return color;
    }
    
    public static void setColor(String colorParam){
        color = colorParam;
    }
    
    public double findArea(){
        return width * height;
    }
}
