package Returen_Value;

import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value for Square: ");
        int i = input.nextInt();
        
        test test1 = new test();
        int ob = test1.square(i);
        
        System.out.println(ob);
    }
    
}
