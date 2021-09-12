package summation_program;

import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a and b: ");
        
        int a = input.nextInt(),
                b = input.nextInt(),
                j = 0;
        for (int i = a; i <= b; i++) {
            if(i%2==0)
                j = j+i;
        }
        System.out.println("Summation = "+j);
    }
}
