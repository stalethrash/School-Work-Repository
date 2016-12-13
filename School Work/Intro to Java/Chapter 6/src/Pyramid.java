/*
 * Natasha Cook
 * May 1, 2015
 * Buggy Pyramid
 */


public class Pyramid{
    public static void main(String args[]){        
        int i = 1;
        while(i < 6){
            int r = 0;
            while(r < i){
                System.out.print("*");
                r++;
            }
            System.out.println();
            i++;
        }
    }
}


