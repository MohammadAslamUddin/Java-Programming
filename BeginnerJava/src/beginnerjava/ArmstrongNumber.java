package beginnerjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int i,
                j,
                k = 0,
                n = input.nextInt();
        
        for(i = n; i != 0; i = i/10)
        {
            j = i%10;
            k = k+(j*j*j);
        }
        if( n == k)
            System.out.println("It's an armstrong number!");
        else
            System.out.println("It's not an armstrong number!");
    }
    
}
