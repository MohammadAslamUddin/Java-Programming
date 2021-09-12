package beginnerjava;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double b,h,area;
        
        System.out.println("Enter the base value of the triangle: ");
        b = input.nextDouble();
        
        System.out.println("Enter the hight value of the triangle: ");
        h = input.nextDouble();
        
        area = 0.5*b*h;
        
        System.out.println("Area of the triangle is: "+area);
    }
    
}
