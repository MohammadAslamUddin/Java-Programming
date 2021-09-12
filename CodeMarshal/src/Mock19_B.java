
import java.util.*;

public class Mock19_B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, temp_roll, temp_number;
        String temp_name;
        int n = input.nextInt();
        int[] roll = new int[100];
        int[] number = new int[100];
        String[] name = new String[100];
        while (input.hasNext()) {
            for (i = 0; i < n; i++) {
                roll[i] = input.nextInt();
                name[i] = input.next();
                number[i] = input.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (number[j] <= number[j + 1]) {
                    temp_number = number[j];
                    temp_roll = roll[j];
                    temp_name = name[j];

                    number[j] = number[j + 1];
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];

                    number[j + 1] = temp_number;
                    roll[j + 1] = temp_roll;
                    name[j + 1] = temp_name;
                }
            }
            System.out.println("Roll" + " " + "Name" + "    " + "Number");
            System.out.println("-----------------------");
            for (int j = 0; j < n; j++) {
                System.out.println(roll[j] + " " + name[j] + "    " + number[j]);
            }
        }
    }
}
