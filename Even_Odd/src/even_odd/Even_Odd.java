package even_odd;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value to find its even or odd: ");
        int n = input.nextInt();
        
        if ( n%2 == 0) 
        {
            System.out.println("It's an even number");
        }
        else
            System.out.println("It's an odd number");
        
    }
    
}
