
import java.util.*;

public class Code71A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, i, len;
        n = input.nextInt();
        i = 0;
        String s;
        while(i<n){
            s = input.next();
            len = s.length();
            if (len > 10) {
                System.out.print(s.charAt(0));
                System.out.print(len-2);
                System.out.println(s.charAt(len-1));
            }else{
                System.out.println(s);
            }
        i++;    
        }
    }
}
