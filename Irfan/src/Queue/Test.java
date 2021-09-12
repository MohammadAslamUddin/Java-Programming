package Queue;

import static java.lang.System.exit;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Queue Queue1 = new Queue();
        
        int Number,
                value = 0;
        
        System.out.println("-------------Menu-------------");
        System.out.println("Click:-");
        System.out.println("\t1.Insrtion");
        System.out.println("\t2.Detetion");
        System.out.println("\t3.Display");
        System.out.println("\t4.Exit");
        
        do{
            System.out.println();
            System.out.print("Enter which operation do you want to do: ");
            Number = input.nextInt();
            switch(Number){
                case 1: 
                    System.out.print("Enter the value: ");
                    value = input.nextInt();
                    Queue1.Push(value);
                  break;  
                case 2:
                    Queue1.Pop(value);
                    break;
                case 3:
                    Queue1.Display();
                default:
                    exit(0) ;
            } 
        }
        while(Number<4);
    }    
}