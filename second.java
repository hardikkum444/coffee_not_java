// taking input in arrayList unitil String

import java.util.*;

public class second{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter elements");

        ArrayList<Integer> ans = new ArrayList<>();

        // int pong = 0;
        while(true){

            if(scan.hasNextInt()){
                ans.add(scan.nextInt());
            }else{
                break;
            }
        }

        for(int num : ans){
            System.out.println(num);
        }
    }
}
