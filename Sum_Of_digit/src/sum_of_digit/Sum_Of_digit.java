package sum_of_digit;

import java.util.Scanner;

public class Sum_Of_digit {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a value: ");
        int n = input.nextInt(),
                j = 0;
        for (int i = n; i > 0; i/=10) {
            j = j +(i%10);
        }
        System.out.println(j);
    }
    
}
