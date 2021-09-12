
import java.util.Scanner;

public class Horse_Move {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i,j;
        
        i = input.nextInt();
        j = input.nextInt();
        
        if ((i==1 && j==1)||(i==8&&j==1)||(i==1&&j==8)||(i==8&&j==8)) {
            System.out.println(2);
        }
        else if ((i==2 && j==1) || (i==7 && j==1) || (i==2 && j==8) || (i==7 && j==8)) {
            System.out.println(3);
        }
        else if ((i==3 && j==1) || (i==6 && j==1) || (i==3 && j==8) || (i==6 && j==8)) {
            System.out.println(4);
        }
        else if ((i==4 && j==1) || (i==4 && j==8) || (i==5 && j==1) || (i==5 && j==8)) {
            System.out.println(4);
        }
        else if ((i==1 && j==2) || (i==1 && j==7) || (i==8 && j==2) || (i==8 && j==7)) {
            System.out.println(3);
        }
        else if ((i==2 && j==2) || (i==2 && j==7) || (i==7 && j==2) || (i==7 && j==7)) {
            System.out.println(4);
        }
        else if ((i==3 && j==2) || (i==6 && j==2) || (i==3 && j==7) || (i==6 && j==7)) {
            System.out.println(6);
        }
        else if ((i==4 && j==2) || (i==5 && j==2) || (i==4 && j==7) || (i==5 && j==7)) {
            System.out.println(6);
        }
        else if ((i==1 && j==3) || (i==8 && j==3) || (i==1 && j==6) || (i==8 && j==6)) {
            System.out.println(4);
        }
        else if ((i==2 && j==3) || (i==7 && j==3) || (i==2 && j==6) || (i==7 && j==6)) {
            System.out.println(6);
        }
        else if ((i==3 && j==3) || (i==6 && j==3) || (i==3 && j==6) || (i==6 && j==6)) {
            System.out.println(8);
        }
        else if ((i==4 && j==3) || (i==5 && j==3) || (i==4 && j==6) || (i==5 && j==6)) {
            System.out.println(8);
        }
        else if ((i==1 && j==4) || (i==8 && j==4) || (i==1 && j==5) || (i==8 && j==5)) {
            System.out.println(4);
        }
        else if ((i==2 && j==4) || (i==7 && j==4) || (i==2 && j==5) || (i==7 && j==5)) {
            System.out.println(6);
        }
        else if ((i==3 && j==4) || (i==6 && j==4) || (i==3 && j==5) || (i==6 && j==5)) {
            System.out.println(8);
        }
        else if ((i==4 && j==4) || (i==5 && j==4) || (i==4 && j==5) || (i==5 && j==5)) {
            System.out.println(8);
        }
    }
}
