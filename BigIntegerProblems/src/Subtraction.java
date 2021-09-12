import java.math.BigInteger;
import java.util.Scanner;

public class Subtraction {
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int a,b;
            a = input.nextInt();
            b = input.nextInt();

            BigInteger A = BigInteger.valueOf(a);
            BigInteger B = BigInteger.valueOf(b);

            String x,y,z;
            y=A.pow(b).toString();
            z=B.pow(a).toString();
            int c = y.length();
            int d = z.length();

            x = A.pow(b).subtract(B.pow(a)).toString();

            //z = x-y;
            System.out.println(x+"\n"+c+"\n"+d);
        }
    }   
}
