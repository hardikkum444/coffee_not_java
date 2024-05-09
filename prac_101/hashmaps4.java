// using hashmaps ans arraylist to solve a question

import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> mandom = new ArrayList<>();
        
        mandom.add(2);   
        mandom.add(3);   
        mandom.add(5);   
        mandom.add(3);   
        mandom.add(7);   
        mandom.add(2);   
        mandom.add(5);
        
        HashMap<Integer, Integer> mandom2 = new HashMap<>();
        
        for(int num : mandom){
            if(mandom2.containsKey(num)){
                mandom2.put(num,mandom2.get(num)+1);
            }else{
                mandom2.put(num,1);
            }
        }
        
        for(int num : mandom2.keySet()){
            if(mandom2.get(num)==1){
                System.out.println(num);
                break;
            }
        }
    }
}
