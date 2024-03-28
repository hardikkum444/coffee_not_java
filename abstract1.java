// one very important thing to remember in abstract class is that overiding is used

// now in normal ovrriding, you can change the parameters and the return type of the function

// but when it comes to abstract classes, you cant change the config of the function that you have set in your abstract class i.e you cannot change the parameters or return type from what you have declared in the abstract class

// ABSTRACT METHOD:
// a method which is declared but not implemented

public class abstract1 {
    
    public static void main(String[] args){
        
        System.out.println("this is working");
        
        derived1 hardik = new derived1();
        
        hardik.greet();
        hardik.name("hardik");
        hardik.age(19);
    }
}

abstract class steal {
    public void greet(){
        System.out.println("buenos dias mi amigo");
    }
    
    public abstract void name(String name);
    
    public abstract void age(int age);
}

class derived1 extends steal {
    
    @Override
    public void name(String name){
        
        System.out.println("hello "+name);
    }
    
    @Override
    public void age(int age){
        
        System.out.println("your age is "+age);
    }
}
