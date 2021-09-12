package date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Demo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time1 = time.format(timeformat);
        System.out.println(time1);
    }
}
