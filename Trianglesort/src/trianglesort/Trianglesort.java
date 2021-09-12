package trianglesort;

import java.util.Scanner;

public class Trianglesort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,
                j,
                k,
                count=0;
        int[] value = new int[20];
        
        System.out.print("How many values do you wanna take: ");
        int n = input.nextInt();
        
        System.out.println("Enter "+n+" values:");
        for (i = 0; i  < n; i++) {
            value[i]=input.nextInt();
        }
        
        for (i = 0; i < n-2; i++) {
            for (j = i+1; j < n-1; j++) {
                for (k = j+1; k < n; k++) {
                    if((value[i]+value[j])>value[k])
                    {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count+" triangle can be made.");
    }
}
