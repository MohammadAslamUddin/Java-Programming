package armstrong_number;

import java.util.Scanner;

public class Armstrong_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(),j = 0, k = 0;
        
        for (int i = n; i > 0; i/=10) {
            j = i%10;
            k = k + (j*j*j);
        }
        
        if (n == k) 
            System.out.println("It's an Armstrong Number");
        else
            System.out.println("It's not an Armstrong Number.");
    }
     
}
