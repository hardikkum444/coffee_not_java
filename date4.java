import java.time.*;
import java.time.format.*;
import java.util.*;
import java.text.*;


public class main {
    
    public static void main(String[] args){
        
        LocalDate dt1 = LocalDate.of(2004,03,30);
        LocalDate dt2 = LocalDate.of(2024,03,30);
        
        // Duration duration = Duration.between(dt1,dt2);
        Period period = Period.between(dt1,dt2);
        
        // System.out.println(duration.getSeconds()/3600/24/365);
        // String ans = period.replace("p","");
        System.out.println(period.getYears());
        long totaldays = period.getYears()*365 + period.getMonths()*30 + period.getDays();
        System.out.println(totaldays);
    }
}
