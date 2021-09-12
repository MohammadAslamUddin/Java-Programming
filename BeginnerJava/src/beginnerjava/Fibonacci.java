package beginnerjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n= in.nextInt(),i,j,k;
        
        int f1 = 0,
                f2 = 1;
        
        System.out.print(f1+"  "+f2);
        
        for(i = 3; i <= n ; i++)
        {
            k = f1 + f2;
            System.out.print("  "+k);
            f1 = f2;
            f2 = k;
        }        
        
    }
    
}
