/* Mitch Meyer
 * 3/26/15
 * Assignment 1.2
 *
 * Programming Exercise 1.9
 * (Area and perimeter of a rectangle) Write a program that displays the area 
 * and perimeter of a rectangle with the width 4.5 and height of 7.9 using the 
 * following formula:
 * area = width x height
 */

/**
 *
 * @author Mitch Meyer
 */
public class PE1_9 {
    public static void main(String[] args){
        
        double w = 4.5;
        double h = 7.9;
            
            System.out.println("A rectangle has a width " + w);
            System.out.println("A rectangle has a heigth " + h);
            System.out.println("The perimeter of that rectangle is");
            System.out.println(w + w + h + h);
            System.out.println("The area of that rectangle is");
            System.out.println(h * w);
    }
}
