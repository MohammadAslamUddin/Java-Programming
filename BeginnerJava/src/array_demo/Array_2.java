package array_demo;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double[] array = new double[5];
        double j = 0;
        
        int len = array.length;
        System.out.println("Enter "+len+" values: ");
        
        for(int i = 0; i < len; i++)
        {
            array[i] = input.nextDouble();
        }
        
        for(int i = 0; i < len; i++)
        {
             j = j + array[i];
        }               
        System.out.println("Sumation is = "+j);
        System.out.println("Average is = "+(j/len));
        
        double min,max;
        
        max = array[0]; 
        min = array[0]; 
        
        for (int i = 1; i < 5; i++) {        
            if (max< array[i]) {
                max = array[i];
            }
            if (min > array[i])
            {
                min = array[i];
            }
        }
        
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
    
}
