/*
 * Mitch Meyer
 * 4/25/15
 * Listing 5.12
 * Bellevue University
 * TestBreak.java
 */

public class TestBreak {
    public static void main(String[] args){
        int sum = 0;
        int number = 0;
        
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
