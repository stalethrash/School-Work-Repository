/*
 * Programming Exercise 1.8
 * (Area and perimeter of a circle) Write a program that displays the area and 
 * perimeter of a circle that has a radius of 5.5 using the following formulas:
 *  perimeter = 2 x radius x pi 
 *  area = radius x radius x pi
 */

/**
 *
 * @author Mitch Meyer
 */
public class PE1_8 {
    public static void main(String[] args){
        double r = 5.5;
            System.out.println("The radius of a ciricle is ");
            System.out.println(r);
            System.out.println("The perimeter of that circle is");
            System.out.println(2.0 * r * 3.1459);
            System.out.println("The area of that circle is");
            System.out.println(r * r * 3.1459);
    }
    
}
