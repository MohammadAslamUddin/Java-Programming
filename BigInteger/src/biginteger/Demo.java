package biginteger;

import java.math.BigInteger;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BigInteger num = input.nextBigInteger();
        
        System.out.println(num);
    }
    
}
