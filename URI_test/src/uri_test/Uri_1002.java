package uri_test;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Uri_1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double R,A;
        R = input.nextDouble();
        A =(float) (3.14159*pow(R,2));
        System.out.printf("A=%.4f",A);
        System.out.println();
        System.out.println();
    }
}
