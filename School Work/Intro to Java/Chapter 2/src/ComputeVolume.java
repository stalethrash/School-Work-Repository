//The formula for calculating volume is Volume = Length * Width * Height
//Let see you find my "bug"
import java.util.Scanner;

public class ComputeVolume {
    public static void main(String[] args) {
            
    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number for length in inches: ");
     double length = input.nextDouble();
     
     System.out.print("Enter a number for width in inches: ");
     double width = input.nextDouble();
     
     System.out.print("Enter a number for height in inches: ");
     double height = input.nextDouble();
     
     double volume = length * width * height; 
     
     System.out.println("The volume of you object is " + volume);
    }
}