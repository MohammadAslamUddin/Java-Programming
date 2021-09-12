package Static_Count;

public class Counter {
    static int count = 0;
    
    Counter(){
        count++;
    }
    void display(){
        System.out.println("Student Number = "+count);
    }
}
