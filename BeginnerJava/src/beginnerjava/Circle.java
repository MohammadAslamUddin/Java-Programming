package beginnerjava;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double r,
                area,
                pi = 3.1416;
        
        System.out.println("Enter the value of radious of the circle: ");
        r = input.nextDouble();
        
        area = pi*r*r;
        
        System.out.println("The area of the circle is: "+area);
    }
    
}
