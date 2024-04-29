import java.util.*;

public class wildCard5{

    public static <T extends Number> double compare(List<T>list , T line){

        double line2 = line.doubleValue();
        double ans = 0.0;

        for(T num : list){
            if(num.doubleValue()>line2){
                ans+=1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = scan.nextInt();
        System.out.println("Enter the BPL");
        int bpl = scan.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();

        System.out.println("Integer:");

        for(int i = 0;i<size;i++){
            
            int temp = scan.nextInt();
            arr1.add(temp);
        }

        System.out.println("Numbers above bpl --> "+compare(arr1,bpl));
        
        System.out.println("Double:");

        ArrayList<Double> arr2 = new ArrayList<>();

        for(int i = 0;i<size;i++){
            
            double temp = scan.nextDouble();
            arr2.add(temp);
        }
        
        System.out.println("Numbers above bpl --> "+compare(arr2,(double)bpl));

    }
}
