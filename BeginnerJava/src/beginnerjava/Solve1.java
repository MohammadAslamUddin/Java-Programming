package beginnerjava;

import java.util.Scanner;

public class Solve1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i, j = 0, n, k;
        System.out.println("Enter the last valur: ");
        n=input.nextInt();
        
        for(k = 0,i = 1; i <= n; i++)
        {
            k = (int) Math.pow(i, 2);
            j = j+k;
        }
        System.out.println("The valu is = "+j);
    }
}
        