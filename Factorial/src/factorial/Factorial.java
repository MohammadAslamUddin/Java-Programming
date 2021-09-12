package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a positive value: ");
        int n = input.nextInt(),
                Fact = 1;
        
        for (int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }
        System.out.println("Factoira = "+Fact);
    }
    
}
