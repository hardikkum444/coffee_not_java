// basic usage of treeset in java
import java.util.*;

public class ts1{
    
    public static void main(String[] args){

        int[] arr = {2,3,4,2,3,1,5,1,2};

        //removing all the duplicate elements

        TreeSet<Integer> ts = new TreeSet<>();

        for(int num : arr){
            ts.add(num);
        }
        //treeset doesnt provide direct access to its elements which is why you have to use 
        //first(), last(), lower(int num), higher(int num)
        System.out.println(ts);
    }
}
