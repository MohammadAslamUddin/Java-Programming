package selectionsort;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] value = new int[20];
        
        System.out.print("How many values do you want to use: ");
        int temp,a, n = input.nextInt();
        
        System.out.println("Enter "+n+" values: ");
        
        for (int i = 1; i <= n; i++) {
            value[i] = input.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (value[i]>value[j]) {
                    temp= value[i];
                    value[i] = value[j];
                    value[j]= temp;
                }
            }
        }
        
        System.out.println("After selection sort: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(value[i]+"  ");
        }
        System.out.println();
        
    }
    
}
