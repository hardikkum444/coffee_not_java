// this will take input and find the days between them

import java.time.*;
import java.time.format.*;
import java.util.*;
import java.text.*;

public class date5 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String d1 = scan.nextLine();
        String d2 = scan.nextLine();
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalDate dt1 = LocalDate.parse(d1,df);
        LocalDate dt2 = LocalDate.parse(d2,df);
        
        Period period = Period.between(dt1,dt2);
        
        System.out.println(period.getYears()*365+period.getMonths()*30+period.getDays());
    }
}
