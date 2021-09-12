package beginnerjava;

import java.util.Scanner;

public class AssignmentExpretion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x,y;
        
        System.out.println("Enter the value of x: ");
        x = input.nextInt();
        
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        
        x+=y;
        System.out.println("Addition = "+x);
        
        
        x-=y;
        System.out.println("Subtraction = "+x);
        
        
        x*=y;
        System.out.println("Multiplication = "+x);
        
        
        x/=y;
        System.out.println("Division = "+x);
        
        
        x%=y;
        System.out.println("Remainder = "+x);
        
        
    }
    
}
