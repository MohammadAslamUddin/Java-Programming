package irfan;

import java.util.Scanner;

public class Queue {
    Scanner input  = new Scanner(System.in);
    static int[] LA = new int[20];
    static int[] temp =new int[20];
    static int Back;    
    int Front = -1;
    
    
    void Push(){
        System.out.println("Enter how many elements do you want to add: ");
        Back = input.nextInt();
        
        System.out.println("Enter "+Back+" elements: ");
        
        Front = Back-1;
        
        for (int i = 0; i < Back; i++) {
            LA[i] = input.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < Back; i++) {
            System.out.println("Array["+(i+1)+"] = "+LA[i]);
        }   
        System.out.println();
    }
    void pop(){
        if (Front == -1) {
            System.out.println("The Queue is Underflow");
        }
        else if(Front>-1)
        {
            for (Front = 0; Front==0; Front++) {
                System.out.println(LA[Front]+" is deleted.");
                Back--;
            }
        }
    }
    void display(){
        Front += 2;
        for (int i = Front+2,j = 0; i < Back; i++,j++) {
            temp[j] = LA[i];
        }
        System.out.println("Present array is: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Array["+(i+1)+"] = "+temp[i]);
        }
    }
}
