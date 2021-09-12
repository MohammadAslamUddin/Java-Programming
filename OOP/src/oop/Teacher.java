package oop;

import java.util.Scanner;

public class Teacher {
    
    Scanner input = new Scanner(System.in);
    String Name,
            Phone,
            Gender;
    
    void input(){
        System.out.println("Enter the Name: ");
        Name = input.nextLine();
        System.out.println("Enter the Gender: ");
        Gender = input.nextLine();
        System.out.println("Enter the phone number: ");
        Phone = input.nextLine();
    }
    
    void display(){
        System.out.println("Name = "+Name);
        System.out.println("Gender = "+Gender);
        System.out.println("Phone = "+Phone);
        
    }
}
