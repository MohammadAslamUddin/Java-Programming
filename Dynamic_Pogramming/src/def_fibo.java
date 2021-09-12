import java.util.Scanner;

class fibo{
    public int fib(int n){
        if (n==1||n==2) {
            return 1;
        }
        else
            return fib(n-1)+fib(n-2);
    }
}

public class def_fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        fibo f1 = new fibo();
        
        
            int i = input.nextInt();
            System.out.println(f1.fib(i));
        
}
    
}
