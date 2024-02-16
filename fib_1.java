//building my very own fibonacci logic 
import java.util.*;
public class fib{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter: ");
        //System.out.println();
        int n1 = scan.nextInt();
        n1 = n1-2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        
        int c =0;
        
        for (int i=0;i<n1;i++){
            
            c = a+b;
            a = b;
            b = c;
            
            System.out.print(c+" ");
        }
        
        
        
    }
}