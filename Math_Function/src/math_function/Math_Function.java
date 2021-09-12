package math_function;

import java.util.Scanner;

public class Math_Function {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 20, 
                y = 30;
        
        System.out.println(Math.pow(2, 3));
        System.out.println();
        System.out.println(Math.PI);
        System.out.println();
        System.out.println(Math.max(x, y));
        System.out.println();
        System.out.println(Math.min(x, y));
        System.out.println();
        System.out.println(Math.addExact(x, y));
        System.out.println();
        double a = Math.PI;
        System.out.println(Math.round(a));
    }
    
}
