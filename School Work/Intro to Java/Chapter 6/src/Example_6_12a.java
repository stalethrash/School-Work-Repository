/*
 * Mitch Meyer
 * Today's Date
 * Exercise Number
 * Bellevue University
 * Class Name
 */

/**
 *
 * @author Amanda
 */
public class Example_6_12a{

  public static void main(String [] args){

    int localInt_01 = 100;
    int localInt_02 = 55;
    int total = 0;

    System.out.println("localInt_01 = " + localInt_01);

    System.out.println("The sum is: " + Example_6_12a.sum(localInt_01, localInt_02));
    System.out.println("The sum is: " + Example_6_12a.sum(localInt_02, localInt_01));
    System.out.println("The sum is: " + Example_6_12a.sum(localInt_01, localInt_02));
    System.out.println("The sum is: " + Example_6_12a.sum(localInt_02, localInt_01));

    // Output is still 100 - why?
    System.out.println("localInt_01 = " + localInt_01);

    total = Example_6_12a.sum(localInt_01, localInt_02);

    System.out.println("The sum is: " + total);
  }

  public static int sum(int param_01, int param_02){

    param_01 += param_02;

    return param_01;
  }
}