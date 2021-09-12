package biginteger.Fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        BigInteger num = null;
        
        System.out.print("Enter how many fibonacci elements you want: ");
        long num1,
                n = input.nextInt();
        
        long first = 0, second = 1;
        System.out.println("Fibo-1: 0\nFibo-2: 1");
        for (int i = 3; i <= n; i++) {
            num1 = first + second;
            num = BigInteger.valueOf(num1);
            System.out.println("Fibo-"+i+": "+num);
            first = second;
            second =  num1;
        }        
    }   
}
