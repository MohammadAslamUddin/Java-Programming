package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {

        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String Currentdate = dateFormat.format(date);
        
        System.out.println("Current Date : "+Currentdate);
        

    }
    
}
