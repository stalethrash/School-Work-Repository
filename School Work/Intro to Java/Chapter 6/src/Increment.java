/*
 * Mitch Meyer
 * 4/25/15
 * Listing 6.4
 * Bellevue University
 * Increment.java
 */


public class Increment {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment (x);
        System.out.println("After the call, x is " + x);        
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }    
}
