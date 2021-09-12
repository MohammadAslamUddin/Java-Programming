
import java.util.*;

public class Mock19_A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, result;
        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if (a > 0 && a <= 100 && b > 0 && b <= 100 && c > 0 && c <= 100) {
                if (a == b && b != c || a == c && c != b || b == c && c != a) {
                    System.out.println("Isosceles Triangle");
                } else if (a == b == c >= 0) {
                    System.out.println("Equilateral Triangle");
                } else {
                    System.out.println("Bad Triangle");
                }
            }
        }
    }
}
