package vowel_consonent;

import java.util.Scanner;

public class Vowel_Consonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Character: ");
        char ch = input.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("It's a vowel");
        else
            System.out.println("It's a consonent");
    }
    
}
