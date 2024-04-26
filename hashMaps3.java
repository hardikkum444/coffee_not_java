// with freq 1

import java.util.*;

public class prac10{

    public static void main(String[] args){

        int[] arr = {2, 3, 4, 3, 2, 5, 6};

        HashMap<Integer, Integer> mapin = new HashMap<>();

        for(int num : arr){

            if(mapin.containsKey(num)){
                mapin.put(num, mapin.get(num)+1);
            }else{

                mapin.put(num, 1);
            }
        }

        for(int key : mapin.keySet()){
            if(mapin.get(key)==1){
                System.out.println("Number with freq 1 is : "+key);
            }
        }
    }
}

