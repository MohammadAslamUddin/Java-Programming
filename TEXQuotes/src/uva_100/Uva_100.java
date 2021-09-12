package uva_100;

import java.util.Scanner;

public class Uva_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,max;
       
        int count,temp = 0;
        int k=0;
        while(input.hasNext()){
            max = 0; 
            count = 1;
            i = input.nextInt();
            j = input.nextInt();

            if (i>j) {
                temp = i;
                i = j;
                j = temp;
            }
            for(;i <= j;i++){
                
                for(k=i;k != 1;){
                    if (k%2 == 0) k = k/2;
                    else k = (3 * k) + 1;
                    count++;
                    if (k==1)break;
                }
                if(count> max) max = count;
                count = 1;
               
            }
            System.out.println(i+" "+j+" "+max);
        }
    }
}