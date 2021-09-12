package beginnerjava;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int a;
        a = input.nextInt();
        if(a > 0)
        {
            System.out.println("Positive");
        }
        else if( a < 0)
        {
            System.out.println("Negative");
        }
        else
        {
                System.out.println("Zero");
        }
    }
}
