// using chronounit to find the number of saturdays between two dates

import java.util.*;
import java.time.temporal.*;
import java.time.*;

public class main {
    
    public static void main(String[] args){
        
        LocalDate sd = LocalDate.of(2024,05,06);
        LocalDate ed = LocalDate.of(2024,05,14);
        
        int count = 0;
        
        while(!sd.isAfter(ed)) {
            
            if(sd.getDayOfWeek() == DayOfWeek.SATURDAY){
                count+=1;
            }
            sd = sd.plus(1,ChronoUnit.DAYS);
        }
        
        System.out.println("Number of saturdays between the two dates is --> "+count);
    }
}
