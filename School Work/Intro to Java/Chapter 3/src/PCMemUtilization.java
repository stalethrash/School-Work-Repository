import java.util.Scanner;

public class PCMemUtilization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How much RAM does you PC have? ");
                int RAM = input.nextInt(); 
                
        System.out.print("What percent CPU utilization is you PC at right now? ");
                double utilization = input.nextDouble();
                 if (utilization >= 75 && RAM <= 3)
                    System.out.println("You may need to close some programs or install more RAM. ");
                     
                 if (utilization >= 75 && RAM > 3)
                    System.out.println("You may need to close some programs.");
                 if (utilization < 75 && RAM > 3)
                    System.out.println("Your computer should be fine.");
                 if (utilization < 75 && RAM <= 3)
                    System.out.println("You may need install additional RAM.");
                
    }
    
}
