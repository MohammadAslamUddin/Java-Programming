package beginnerjava;

public class BreakStatement {
    public static void main(String[] args) {
        
        int i;
        
        for(i = 0; i <= 100; i =i+5)
        {
            if(i == 10)
                break;
            System.out.println(i);
        }
    }
}
