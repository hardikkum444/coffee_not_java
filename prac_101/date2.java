// using chronounit to calculate the number of days between 2 dates

import java.util.*;
import java.time.temporal.*;
import java.time.LocalDate;

class date2 {

    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String[] el1 = scan.nextLine().split("-");
        String[] el2 = scan.nextLine().split("-");
        
        // String date1 = scan.nextLine();
        // String date2 = scan.nextLine();
        
        LocalDate date1 = LocalDate.of(Integer.parseInt(el1[0]),Integer.parseInt(el1[1]),Integer.parseInt(el1[2]));
        LocalDate date2 = LocalDate.of(Integer.parseInt(el2[0]),Integer.parseInt(el2[1]),Integer.parseInt(el2[2]));
        
        long ans = ChronoUnit.DAYS.between(date1,date2);
        System.out.println(ans);
        
    }
}
