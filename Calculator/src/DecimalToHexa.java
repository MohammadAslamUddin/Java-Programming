import java.util.*;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String hex = "";
            System.out.println("Please enter an decimal number: ");
            int n = input.nextInt();
            while(n!= 0){
            int i = n%16;
                switch(i){
                    case 10: hex = 'A' + hex;
                    break;
                    case 11: hex = 'B' + hex;
                    break;
                    case 12: hex = 'C' + hex;
                    break;
                    case 13: hex = 'D' + hex;
                    break;
                    case 14: hex = 'E' + hex;
                    break;
                    case 15: hex = 'F' + hex;
                    break;
                    default: hex = i + hex;
                }
                n /= 16;
            }
            System.out.println("hexadecimal value is : "+ hex);
    }
}
