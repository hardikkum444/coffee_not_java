// sorting array using Arrays.sort()

import java.util.*;


public class main{
    
    public static void main(String[] args){
        
        int[] arr = {5,2,6,3,4,1,2};
        
        Arrays.sort(arr);
        
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
