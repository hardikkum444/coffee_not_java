import java.util.*;

public class wildCard3{

    public static <T extends Number> T returnMax(List<T>list){

        T max = list.get(0);
        for(T num : list){
            if (num.doubleValue()>max.doubleValue()){ //cant compare generic data types
                max = num;
            }
        }
        return max;
    }


    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scan.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0;i<size;i++){
            
            int temp = scan.nextInt();
            arr.add(temp);
        }

        System.out.println("max element : "+returnMax(arr));

        List<Double> arr1 = new ArrayList<>();

        for(int i = 0;i<size;i++){

            double temp = scan.nextDouble();
            arr1.add(temp);
        }

        System.out.println("max element : "+returnMax(arr1));

    }
}
