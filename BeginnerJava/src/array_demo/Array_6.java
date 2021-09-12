package array_demo;

public class Array_6 {
    public static void main(String[] args) {
        
        int[][] num = new int[4][4];
        int k = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                
                System.out.print(" "+(k++));
                
            }System.out.println();
            
        }
    }
    
}
