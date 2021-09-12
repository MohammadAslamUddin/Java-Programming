package dp.fibonacci;

import java.util.Scanner;



public class DpFibonacci {
    
    static int fib(int n){
        int fibo[] = new int[n+2],
                i;
        fibo[0] = fibo[1] = 1;
        
        for ( i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        return fibo[n];
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        System.out.println(fib(n));
    }
    
}
