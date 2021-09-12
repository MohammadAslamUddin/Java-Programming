package beginnerjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i,
                j = 1,
                k = 1,
                l;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        l = input.nextInt();
        
        for(i = l; i >= 1; i--)
        {
            j=j*i;
           
        }
        System.out.println(j);
    }
}
