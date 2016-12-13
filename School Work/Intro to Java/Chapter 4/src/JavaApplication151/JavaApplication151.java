
package JavaApplication151;

import java.util.Scanner;

/**
 * @author Natasha
 * @date 4/17/15
 * @description to add two numbers together an provide the answer
 */


public class JavaApplication151 {
    public static void main(String[] args) {
        // TODO code application
       Scanner input = new Scanner(System.in); 
       double fnum, snum, answer;
       System.out.println("This program subtracts two entered values.");
       System.out.println("Enter first num: ");
       fnum = input.nextDouble();
       System.out.println("Enter second num: ");
       snum = input.nextDouble();
       answer = fnum - snum;
       System.out.println(answer);
    }
}