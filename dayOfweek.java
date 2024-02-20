//day of the week simple code
import java.util.*;

public class dayOfweek {
    
    enum day {
        
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Firday;
    }
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String ans = scan.nextLine();
        
        day days;
        
        switch(ans){
            
            case "sun":
            System.out.println(day.Sunday);
            break;
            
            case "Mon":
                System.out.println(day.Monday);
                break;
            
            //and this goes on ....
            
        }
        
        
    }
}


//*Mon