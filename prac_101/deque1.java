// checking the difference between deque and arraylist

import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Deque<Integer> mandom = new ArrayDeque<>();
        ArrayList<Integer> mandom2 = new ArrayList<>();
        
        mandom.addFirst(1);
        mandom2.add(1);
        mandom.addFirst(2);
        mandom2.add(2);
        mandom.addFirst(3);
        mandom2.add(3);
        mandom.addFirst(4);
        mandom2.add(4);
        
        // mandom.removeFirst();
        
        // System.out.println(mandom.getFirst());
        
        System.out.println(mandom);
        System.out.println(mandom2);
        mandom2.remove(2);
        System.out.println(mandom2);
    }
}
