package array_demo;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
    
        int len = array.length;
        System.out.println("Enter "+len+" values: ");
        
        
        for (int i=0; i<5; i++)
        {
            array[i] = input.nextInt();
        }
        
        System.out.print("Arrays are:");
        for (int i=0; i<5; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }    
    
}
