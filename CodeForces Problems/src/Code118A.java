
import java.util.*;


public class Code118A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len;
        String st1,st2;
        while (input.hasNext()) {
            st1 = input.next();
            len = st1.length();
            st2 = "";
            for (int i = 0; i < len; i++) {
                if (st1.charAt(i) == 'a' || st1.charAt(i) == 'e' || st1.charAt(i) == 'i' || st1.charAt(i) == 'o' || st1.charAt(i) == 'u' || st1.charAt(i) == 'A' || st1.charAt(i) == 'E' || st1.charAt(i) == 'I' || st1.charAt(i) == 'O' || st1.charAt(i) == 'U') {
                }
                else{
                    st2 += '.';
                    st2 += st1.toLowerCase().charAt(i);
                }   
            }
            System.out.println(st2);
        }
    }
}
