package String;

import java.util.Scanner;

public class Decimal_to_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal value: ");
        int decimal = input.nextInt();
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = "+octal);
    }
    
}
