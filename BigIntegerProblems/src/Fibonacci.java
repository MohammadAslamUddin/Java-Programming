import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BigInteger arr[] = new BigInteger[50000];
        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(2);
        for (int i = 2; i < 50000; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        while(true){
            BigInteger a,b;
            a = input.nextBigInteger();
            b = input.nextBigInteger();
            if(b.compareTo(BigInteger.valueOf(0))==0){
                break;
            }
            
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i].compareTo(a)>=0 && arr[i].compareTo(b)<=0) {
                    count++;
                }
                if (arr[i].compareTo(b)>0 ){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
