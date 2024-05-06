// using hashmap to store freq of numbers in an array

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        HashMap <Integer, Integer> mandom = new HashMap<>();
        int[] arr = {1,1,2,3,4,2,1,4,5};
        
        for(int num : arr){
            
            if(mandom.containsKey(num)){
                mandom.put(num, mandom.get(num)+1);
            }else{
                mandom.put(num, 1);
            }
        }
        
        System.out.println(mandom);
    }
}
