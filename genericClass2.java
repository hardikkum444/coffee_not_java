// making a pair data structure using generic class 
import java.util.*;

public class genericClass2<T,U>{

    private T obj1;
    private U obj2;

    public genericClass2(T man1 , U man2){
        this.obj1 = man1;
        this.obj2 = man2;   
    }

    public T getFirst(){
        return this.obj1;
    }

    public U getSecond(){
        return this.obj2;
    }

    public static void main(String[] args){
        
        genericClass2<String, Integer> mandom = new genericClass2<>("hardik" , 20);
        System.out.println(mandom.getFirst());
        System.out.println(mandom.getSecond());
        
    }
}
