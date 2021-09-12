package array_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(0,40);
        
        System.out.println(number+" ");
        
        System.out.println("Size = " +number.size());
        
        number.remove(1);
        System.out.println(number+" ");
        
        System.out.println("Size = " +number.size());

    }
    
}
