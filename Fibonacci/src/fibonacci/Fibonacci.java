package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number which Fibonacci value you want: ");
        int j = 0,
                k = 1,
                l = 0,
                n=input.nextInt();
        
        for (int i = 3; i <= n; i++) {
            l = j+k;
            j = k;
            k = l;
        }
        System.out.println(l);
    }
    
}
