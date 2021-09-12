package beginnerjava;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value you want to reverse: ");
        int i,n= input.nextInt(),
                j,k = 0,l;
        
        for(i=n; i!=0;i=i/10){
            j=i%10;
            k = (k*10) +j;
                                   
        }
        System.out.println(k);        
    }
    
}
