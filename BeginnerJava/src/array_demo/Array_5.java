package array_demo;

import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] num1 = new int[3][3],
                num2 = new int[3][3],
                result = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                num1[i][j] = input.nextInt();
            }
        }        
  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ",i,j);
                num2[i][j] = input.nextInt();
            }
        }        

        System.out.println();
        System.out.print("A = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t "+num1[i][j]);
            }
            System.out.println();
        }        
        
        System.out.println();
        System.out.print("B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t "+num2[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.print("A+B = ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = num1[i][j]+num2[i][j];
                System.out.print("\t "+result[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
