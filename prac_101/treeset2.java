// printing the kth smallest element in java

import java.util.*;

public class ts2 {

    public static void main(String[] args){

        TreeSet<Integer> ts = new TreeSet<>();

        int[] arr = {2,23,4,1,2,4,55,6,77,5,44,34,23};

        // but here we have used a for loop for comparing the numerals
        for(int num : arr){
            ts.add(num);
        }

        int count = 0;

        for(int num : ts){
            count+=1;
            if(count == 3){
                System.out.println("Third smallest element is : "+num);
            }
        }
    }
}
