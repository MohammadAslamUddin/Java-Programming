package reverse_digit;

import java.util.Scanner;

public class Reverse_Digit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        
        int n = input.nextInt(),
                j = 0,
                k = 0;
        
        for (int i = n; i > 0; i/=10) {
            j = i%10;
            k = (k * 10) + j;
        }
        System.out.println("Reverse value is = "+k);
    }
    
}
