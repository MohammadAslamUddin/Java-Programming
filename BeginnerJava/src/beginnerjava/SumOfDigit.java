package beginnerjava;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        
        int i= input.nextInt(),
                j,k,l = 0;
        
        for (j = i; j != 0; j = j/10)
        {
            k = j%10;
            l=l+k;
            
        }
        System.out.println("The sum of the value is: "+l);
        
    }
    
}
