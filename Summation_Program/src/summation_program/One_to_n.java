package summation_program;

import java.util.Scanner;

public class One_to_n {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a integer value: ");
        int n = input.nextInt();
        
        int j = 0;
        
        for (int i = 1; i <= n; i++) {
            j = j+i;
        }
        System.out.println("Sum = "+j);
    }
    
}
