package Iterative_Fibo;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a=0,
                b=1,
                c=0;
        System.out.println("Enetr the fibonacci number you want: ");
        int n = input.nextInt();
        
        for (int i = 2; i <= n; i++) {
            c = a+b;
            a = b;
            b = c;   
        }
        System.out.println("Fibonacc("+n+") = "+c);
    }
    
}
