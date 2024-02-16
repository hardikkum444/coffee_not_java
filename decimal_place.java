/*double num = 3.4454;
int decimalPlaces = 2; // Specify the number of decimal places you want
String formatted = String.format("%.2f", num); // Round to 2 decimal places
System.out.println(formatted); // Output: 3.44
*/


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



