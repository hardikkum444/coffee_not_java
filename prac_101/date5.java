// finding the number of milliseconds
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

class main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        LocalDate ld1 = LocalDate.now();
        
        System.out.print("Enter your preffered date --> ");
        String input = scan.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate ld2 = LocalDate.parse(input,formatter);
        
        long days = ChronoUnit.DAYS.between(ld2,ld1);
        long ans = days*24*60*60;
        
        System.out.println("Number of seconds passed --> "+ans);
        
        
    }
}
