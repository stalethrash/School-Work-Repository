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
public class Example_6_08{

  public static void main(String [] args){

    int localInt = 2;

    // Output is 2
    System.out.println(localInt);

    Example_6_08.getDoubleParam(localInt);

    // Output is 2, why?
    System.out.println(localInt);

    localInt = Example_6_08.getDoubleParam(localInt);

    // What is the output?  Why?
    System.out.println(localInt);
  }

  public static int getDoubleParam(int param){

    return param * 2;
  }
}
    

