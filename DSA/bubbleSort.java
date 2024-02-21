//trying to make the bubble sort algo in java

import java.util.*;

public class Bbsort {
    
    public static void main (String[] args){
        
        
        int[] arr = {3,5,1,2,8,0};
        int size = arr.length;
        
        for(int i=0;i<size;i++){
            
            for(int j=0;j<size-i-1;j++){
                
                if(arr[j+1]<arr[j]){
                    
                    int store = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = store;
                }
            }
            
        }
        
        for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
    
}