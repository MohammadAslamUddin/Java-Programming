import java.util.*;
public class Code118_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str,str1,str2 = "";
        while(input.hasNext()){
            str = input.next();
            str1 = str.replace("[AEIOUaeiou]", "");
            System.out.println(str1);
        }
    }
}
