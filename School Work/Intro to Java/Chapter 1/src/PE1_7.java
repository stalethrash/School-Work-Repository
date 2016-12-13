/*
 * Programming Exercise 1.7
 * (Approximate Pi) Pi can be computed using the following formula:
 * Pi = 4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)
 */
/**
 *
 * @author Mitch Meyer
 */
public class PE1_7 {
    public static void main(String[] args){
        System.out.println("An approximation of Pi is");
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println("A closer approximation of Pi is");
        System.out.println(4.0 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
        }    
}
