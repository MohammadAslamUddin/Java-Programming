package prime_number;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a positive value: ");
        int count = 0,
                n = input.nextInt();
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                count++;
                break;
            }
        }
        if (count == 0) 
            System.out.println("It's a Prime number.");
        else
            System.out.println("It's not a prime number.");
    }
    
}
