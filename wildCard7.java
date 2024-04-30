// upper bound wildcards
//Takes a parameter of type List<? super Integer>, which is a lower bounded wildcard. This means that the list can hold elements of type Integer or any superclass of Integer.

import java.util.*;

public class wildCard7{

    public static void main(String[] args){
        
        List<Number> num = Arrays.asList(1,2,3,4,5);
        printLikeAMan(num);

        List<Integer> bint = Arrays.asList(1,2,3,4,5);
        printLikeAMan(bint);
    }

    public static void printLikeAMan(List<? super Integer>list){
        System.out.println(list);
    }
}
