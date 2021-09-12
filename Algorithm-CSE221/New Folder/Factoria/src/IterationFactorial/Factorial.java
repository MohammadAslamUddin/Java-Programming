package IterationFactorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,fact = 1;
        
        System.out.println("Enter the value which you want in factorial: ");
        n = input.nextInt();
        
        for (i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("The value is "+fact);
    }
}
