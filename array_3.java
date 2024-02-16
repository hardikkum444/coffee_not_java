//biggest and smallest number in java array using for-each loop?
import java.util.*;

public class array_3{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("how many elements wuold you like to have in your array?");
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            
            arr[i] = scan.nextInt();
            System.out.println("Accepted");
        }
        
        
        int biggest = arr[0];
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>biggest){
                
                biggest = arr[i];
            }
            
        }
        System.out.println(biggest);
        
        int smallest = arr[0];
        
        for(int i=0;i<n;i++){
            
            if(arr[i]<smallest){
                
                smallest = arr[i];
            }
            
        }
        System.out.println(smallest);
    }
}