package RecursionFactorial;

import java.util.Scanner;

class Fact{
    public int facto(int n){
        if(n==0)
            return 1;
        else
            return n*facto(n-1);
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fact f1 = new Fact();
        
        System.out.println("Enter the value which you want in factorial: ");
        int value = input.nextInt();
        
        System.out.println(value+"! = "+f1.facto(value));
    }
}
