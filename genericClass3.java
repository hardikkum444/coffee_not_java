// implementing generic class to make a stack data container type thingy
import java.util.*;

public class genericClass3<T> {

    private ArrayList<T> mandom;

    public genericClass3(){

        mandom = new ArrayList<>();
    }

    public void push(T item){
        mandom.add(item);
    }

    public T pop(){
        if(mandom.isEmpty()){
            throw new EmptyStackException();
        }
        
        return mandom.remove(mandom.size()-1);
    }

    public T peek(){
        if(mandom.isEmpty()){

            throw new EmptyStackException();
        }

        return mandom.get(mandom.size()-1);
    }

    public static void main(String[] args){
        
        genericClass3<Integer> mandom = new genericClass3<>();

        mandom.push(9);
        mandom.push(11);
        mandom.push(23);

        mandom.pop();
        System.out.println(mandom.peek());
    }
}
