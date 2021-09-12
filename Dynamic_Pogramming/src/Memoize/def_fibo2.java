package Memoize;

import java.util.Scanner;

class fibo{
    public int fib(int n,int[] memo){
        int result;
        if (memo[n]!=0) {
            result = memo[n];           
        }
        if (n==1||n==2) {
            result=1;
        }
        else{
            result = fib(n-1,memo)+fib(n-2,memo);
        }
        memo[n]= result;
        return result;
    }
}

public class def_fibo2 {
    public static void main(String[] args) {
        fibo f1 = new fibo();
        int[] memo1=f1.fib(1, 2);
        int j;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            
        int i = input.nextInt();
        memo1[j] = null+(i+1);
        }
    }
    
}
