package beginnerjava;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers: ");
        int num1 = input.nextInt(),
                num2 = input.nextInt();
        
        int large = (num1>num2) ? num1 : num2;
        
        System.out.println("Large number is: "+large);
    }
    
}
