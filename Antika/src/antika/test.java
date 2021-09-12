package antika;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        
        String[] name = new String[100];
        name[0]=input.nextLine();
        
        System.out.println("Enter "+ n +" elements: ");
        for (int i = 0; i < n; i++) {
            name[i] = input.nextLine();
        }
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Array["+i+"] = "+name[i]);
        }    
    }    
}
