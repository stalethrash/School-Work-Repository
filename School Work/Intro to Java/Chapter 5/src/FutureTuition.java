/*
 * Mitch Meyer
 * 4/25/15
 * Listing 5.10
 * Bellevue University
 * FutureTuition.java
 */


public class FutureTuition {
    public static void main(String[] args){
        double tuition = 10000; // year 0
        int year = 0;
        
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        
        System.out.println("Tuition will  be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
