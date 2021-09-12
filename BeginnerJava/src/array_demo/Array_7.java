package array_demo;

import java.util.Arrays;

public class Array_7 {
    public static void main(String[] args) {
        
        int[] num = {10,2,5,-3,-2,9};
        int len = num.length;
        
        Arrays.sort(num);
        
        System.out.print("Asecending: ");
        for (int i = 0; i < len; i++) {
            System.out.print(" "+num[i]);            
        }
        System.out.println();
        
        System.out.print("Desending: ");
        for (int i = len-1; i >= 0; i--) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
        
        String[] name = {"Aslam","Monika","Afra","Ayan","Morjia","Dabit","Parvaj"};
        int l = name.length;
        
        Arrays.sort(name);
        
        for (int i = 0; i < l; i++) {
            System.out.print(name[i]+" ");
        }
        System.out.println();
        
    }    
}
