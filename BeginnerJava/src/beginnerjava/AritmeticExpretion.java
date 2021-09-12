package beginnerjava;

import java.util.Scanner;

public class AritmeticExpretion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Enter the first Number: ");
        a = input.nextInt();
        
        System.out.println("Enter the Second Number: ");
        b = input.nextInt();
        
        c = a + b ;
        System.out.println("Addition = "+c);
        
        c = a - b ;
        System.out.println("Subtraction = "+c);
        
        c = a * b ;
        System.out.println("Multiplication = "+c);
        
        double d = (double)a / b ;
        System.out.println("Division = "+d);
        
        c = a % b ;
        System.out.println("Remainder = "+c);
    }
}
