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
/*
 * while, do-while, and for loops
 */
public class exampl55{

  public static void main(String [] args){

    int i = 0;
    int j = 0;

    while(i < 5){

      System.out.println("The value of \"i\" is " + i);
      ++i;
    }

    System.out.println();

    do{

      System.out.println("The value of \"j\" is " + j);
      ++j;

    }while(j < 5);

    System.out.println();

    for(int k = 0; k < 5; ++k){

      System.out.println("The value of \"k\" is " + k);
    }
  }
}