//lets try armStrong number
//but this only works for a three digit number
import java.util.*;
public class armstrong{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        
        int num = scan.nextInt();
        
        arm(num);
        
        
    }
    
    public static void arm(int num){
        
        //345
        
        int n1 = num%10; //5
        int n2 = (num/10)%10; //4
       // int nn = n1-((num%100));
        int n3 = num/100; //3
        
        if(Math.pow(n3,3)+Math.pow(n2,3)+Math.pow(n1,3)==num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}