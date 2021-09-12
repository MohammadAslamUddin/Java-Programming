package Difference;

public class Static_and_nonStatic {
    void display1(){
        display2();
        System.out.println("I'm non Static.");
    }
    static void display2(){
        System.out.println("I'm static.");
    }
    
}
