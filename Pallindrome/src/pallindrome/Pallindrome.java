package pallindrome;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(),
                j = 0,
                k = 0;
        
        for (int i = n; i > 0; i/=10) {
            j = i%10;
            k = (k * 10) + j;
        }
        if (n == k) 
            System.out.println("It's a pallindrome Number");
        else
            System.out.println("It's not a palindrome Number");
    }
    
}
