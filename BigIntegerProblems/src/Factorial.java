
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String fact = Factorial(n);
        System.out.println(fact+"\n"+ fact.length());
    }

    public static String Factorial(int n) {
        BigInteger fact = new BigInteger("1");
        if (n <= 0) {
            return "1";
        }
        else{
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(new BigInteger(i+ ""));
            }
        }
        return fact.toString();
    }
}
