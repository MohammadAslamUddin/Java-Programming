package String;

import java.util.Scanner;

public class Convert_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               
        System.out.println("Enter an hexadecimal value: ");
        String hexa = input.nextLine();
        
        Integer decimal = Integer.parseInt(hexa, 16);
        System.out.println("Decimal = "+decimal);
    }
    
}
