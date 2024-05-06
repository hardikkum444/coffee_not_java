// quick revision of particular days between

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        LocalDate ld1 = LocalDate.now();
        
        String input = scan.nextLine();
        
        LocalDate ld2 = LocalDate.parse(input,formatter);
        
        int count = 0;
        while(!ld1.isAfter(ld2)){
            if(ld1.getDayOfWeek() == DayOfWeek.TUESDAY){
                count+=1;
            }
            
            ld1 = ld1.plus(1,ChronoUnit.DAYS);
        }
        
        System.out.println(count);
    }
}
