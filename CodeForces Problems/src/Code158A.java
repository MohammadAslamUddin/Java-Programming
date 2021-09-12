import java.util.*;

public class Code158A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
        int i,j,k = 0;
        
        i = input.nextInt();
        j = input.nextInt();
        
        int a[] = new int[100];
        
        for (int l = 0; l < i; l++) {
            a[l] = input.nextInt();
        }
        
        
        for (int x = 0; x < i; x++) {
            if (a[x] >= a[j-1] && a[x] != 0) {
                k++;
            }
        }
        System.out.println(k);
        }
    }
}
