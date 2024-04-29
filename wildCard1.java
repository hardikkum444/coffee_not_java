import java.util.*;

public class wildCard1{

    public static double sumList(List<? extends Number>list){
        double sum = 0;
        for(Number num : list){
            sum+=num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args){
        
        System.out.println("Give size of arrayList --> ");
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        System.out.println("Entries for double list --> ");
        
        ArrayList<Double> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i = 0;i<size;i++){
            double temp = scan.nextDouble();
            arr.add(temp);
        }

        System.out.println("for double arraylist --> "+sumList(arr));

        for(int i = 0;i<size;i++){

            int temp = scan.nextInt();
            arr1.add(temp);
        }
        System.out.println("for integer arraylist --> "+sumList(arr));

    }
}
