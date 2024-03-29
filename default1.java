import java.util.*;

interface apply {

    abstract void display();

    default void show(){

        System.out.println("hello this is a default method");
    }
}

public class default1 implements apply {

    public static void main(String[] args){
    
        default1 def = new default1();
        def.display();
        
    
        
    }

    @Override
    public void display(){

        System.out.println("the number shown is 10");
    }


}
