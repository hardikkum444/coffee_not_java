// implemeting default methods in java, the usage of default methods is only done in interfaces since interfaces are 100% abstract

// defaulting a method allows for defining and implementing a method in an interface which can be called

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
        def.show();
        
    
        
    }

    @Override
    public void display(){

        System.out.println("the number shown is 10");
    }


}
