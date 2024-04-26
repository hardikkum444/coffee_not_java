// using a hashmap in a very interesting case

import java.util.*;
public class prac9 {

    public static void main(String[] args){

        int[] arr = {2, 2, 5, 2, 22, 4, 334, 22, 44};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : arr){
            if(frequencyMap.containsKey(num)){

                frequencyMap.put(num, frequencyMap.get(num)+1);
            }else{

                frequencyMap.put(num, 1);
            }
        }

        for(int key : frequencyMap.keySet()) {
            System.out.println("Element: "+key+" Frequency: "+frequencyMap.get(key));
        }
    }
}
