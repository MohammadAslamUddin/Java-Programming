package beginnerjava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int i,
                j,
                k = 0,
                l,
                n = input.nextInt();
        
        for(i = n; i != 0; i=i/10)
                {
                    j = i%10;
                    k = (k*10) + j;                                       
                }
        
        if(n==k)
            System.out.println("It's a Palindrome number.");
        else
            System.out.println("It's not a Palindrome number.");   
    }
}
