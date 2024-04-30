// doing a class question 1

import java.util.*;

public class wildCard6 {

    public static void main(String[] args){

        System.out.println("Enter the size --> ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        List<Integer> arr1 = Arrays.asList(3,4,5,6,7);
        System.out.println("And sum of integer array: "+sum(arr1));

        List<Double> arr2 = Arrays.asList(3.3,2.2,1.5,7.8);
        System.out.println("And sum of double array: "+sum(arr2));

    }

    public static double sum (List<? extends Number>list){

        double ans = 0.0;
        for(Number num : list){
            ans+=num.doubleValue();
        }

        return ans;
    }
}
