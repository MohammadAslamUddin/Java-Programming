package array_demo;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] number = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.printf("A[%d][%d] = ",i,j);
                number[i][j] = input.nextInt();  
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print("   "+number[i][j]);  
            }
            System.out.println();
        }
        
    }
    
}
