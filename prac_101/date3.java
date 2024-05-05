// finding no of days, weeks and particular days using ChronoUnit

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

class main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        LocalDate ld1 = LocalDate.now();
        // LocalDate ld2 = LocalDate.of(2020,5,5);
        
        System.out.print("Enter Date {YYYY-MM-DD} --> ");
        String[] el = scan.nextLine().split("-");
        
        LocalDate ld2 = LocalDate.of(Integer.parseInt(el[0]),Integer.parseInt(el[1]),Integer.parseInt(el[2]));
        
        
        long days = ChronoUnit.DAYS.between(ld2,ld1);
        
        long weeks = days/7;

        long years = days/365;
        
        long ans = weeks*2;
        
        System.out.println("Number of days passed --> "+days);
        System.out.println("Number of weeks passed --> "+weeks);
        System.out.println("Number of years passed --> "+years);
        System.out.println("Number of mondays and tuesdays passed --> "+ans);
    }
}

