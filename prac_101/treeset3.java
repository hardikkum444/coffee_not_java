// using hashmap and treeset to solve a good question

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        ArrayList<Integer> mandom = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        TreeSet<Integer> mandom2 = new TreeSet<>();
        
        for(int i=0;i<size;i++){
            System.out.println("Enter");
            int num = scan.nextInt();
            scan.nextLine();
            mandom.add(num);
            mandom2.add(num);
        }

        
        for(int num : mandom){
            if(mandom2.contains(num)){
                System.out.print(num+" ");
                mandom2.remove(num);
            }
        }
    }
}
