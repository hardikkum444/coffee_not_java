import java.util.*;

public class deqeue1{

    public static void main(String[] args){

        Deque<Integer> mandom = new ArrayDeque<Integer>();

        mandom.add(2);
        mandom.add(4);
        mandom.add(6);
        mandom.add(8);

        System.out.println("Before popping");

        for(int ans : mandom){
            System.out.println(ans);
        }

        mandom.pop();
        
        System.out.println("After popping");

        for(int ans : mandom){
            System.out.println(ans);
        }
    }
}
