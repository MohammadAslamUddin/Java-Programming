package fibonacci;

import java.util.Scanner;

class fibo{
    public int fib(int n){
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        
        fibo f1= new fibo();
        int n=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci: ");
        n = input.nextInt();
        System.out.println("Fibonacci Numbers are: ");
        
        //for (i = 0; i <= n; i++) {
            System.out.println("Fibo("+n+") = "+f1.fib(n));
        //}
    }
    
}
