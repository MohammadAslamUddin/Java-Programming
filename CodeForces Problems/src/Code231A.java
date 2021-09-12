import java.util.*;
import static java.lang.System.exit;

public class Code231A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int count = 0,a,b,c;

            for (int i = 0; i < n; i++) {
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();

                if (a == 0 || b == 0 || c == 0 || a == 1 || b == 1 || c == 1) {
                    if ((a == 1 && b == 1) || (a == 1 && c == 1) || (b == 1 && c == 1) || (a == 1 && b == 1 && c == 1)) {
                        count++;
                    }
                }
                else{
                    exit(0);
                }
            }
            System.out.println(count);
        }
    }
}
