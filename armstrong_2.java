//dynamic number armstrong
//prev one could only handle 3 digit numbers
//this one can handle and number of digit number
import java.util.*;

public class armstrong_2{
    
    public static void arm(int num){
        
        int fin = num;
        
        String num1 = String.valueOf(num);
        int size = num1.length();
        
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++){
            int n3 = num%10;
            num = num/10;
            arr[i] = n3;
        }
        
        double anss = fin;
        double sum = 0.0;
        
        for(int i=0;i<size;i++){
            
            sum+=Math.pow(arr[i],size);
        }
        //System.out.println(anss);
        // System.out.println(sum);
        
        if(anss == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Legstrong");
        }
    }
    
    public static void main(String[] args){
        
        arm(1634);
        
    }
}