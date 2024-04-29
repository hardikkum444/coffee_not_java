// another template question

import java.util.*;

public class wildCard4{

    public static <T extends Number> Double sumOfArr(List<T>arr1, List<T> arr2){

        double ans = 0;

        for(T num : arr1){
            ans = ans+num.doubleValue();
        }

        for(T num : arr2){
            ans = ans+num.doubleValue();
        }

        return ans;
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        System.out.println("First list");
        for(int i = 0;i<size;i++){
            int temp = scan.nextInt();
            arr1.add(temp);
        }
        System.out.println("Second list");

        for(int i = 0;i<size;i++){
            int temp = scan.nextInt();
            arr2.add(temp);
        }

        System.out.println("And the sum is : "+sumOfArr(arr1,arr2));

    }
}
