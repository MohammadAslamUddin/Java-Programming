package summation_program;

import java.util.Scanner;

public class N_to_M {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of m: ");
        int m = input.nextInt();
        
        int j = 0;
        
        for (int i = n; i <= m; i++) {
            j = j+i;
        }
        System.out.println("Sum = "+j);
    }
}
