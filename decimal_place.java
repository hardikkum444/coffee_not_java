import java.util.*;
//decimal spaces

public class decimal_place{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a float");
        
        float f1 = scan.nextFloat();
        
        // System.out.printf("your ans is : %.2f",f1);
        System.out.printf("Your ans is: %.2f\n", f1);
    }
}