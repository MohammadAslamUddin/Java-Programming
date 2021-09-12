package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String Name;
        
        System.out.println("Enter a number: ");
        
        Name = input.nextLine();
        
        System.out.println("Welcome " +Name);
    }
         
    
}
