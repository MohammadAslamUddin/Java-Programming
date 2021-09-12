package irfan;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] Array = new int[20];
        int n;
        
        Queue Queue1 = new Queue();
        do{
        System.out.println("\t\t1.Adding the Number...\n\t\t2.Removing the number...\n\t\t3.Display the Array... ");
        System.out.println("Enter which operation you want to do first: ");
        
        n = input.nextInt();
        switch(n){
            case 1:
                Queue1.Push();
                break;
            case 2: 
                Queue1.pop();
                break;
            case 3:
                Queue1.display();
                break;
            default:
                System.out.println("The Program is ended.");
                break;
            }
        }
        while(n<4);
    }
}
