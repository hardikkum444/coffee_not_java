// How to take input in an array if it is given like 45 5 55 3 22 3

import java.util.*;

public class prac7{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Give input:");
        String line = scan.nextLine();

        String[] sarr = line.split(" ");

        int[] arr = new int[sarr.length];

        for(int i =0;i<sarr.length;i++){
        
            arr[i] = Integer.parseInt(sarr[i]);
        }

        for(int number : arr){
        
            System.out.println(number);
        }

    }
}
