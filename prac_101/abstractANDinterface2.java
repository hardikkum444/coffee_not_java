// showing how interfaces help to solve the diamond problem

// also if youre using java 8 you can use default methods in interfaces, which does nothing but confuses the common man about the difference between interfaces and abstract classes

interface interA {
    default void method1() {
        System.out.println("This is being called from interface1");
    }
}

interface interB {
    default void method1() {
        System.out.println("This is being called from interface2");
    }
}

class Implementation implements interA, interB {
    
    @Override
    public void method1(){
        interA.super.method1();
        interB.super.method1();
        System.out.println("demonstrating the usage of interface for double inheritance");
    }
}

public class main extends Implementation {
    
    public static void main(String[] args){
        
        Implementation im = new Implementation();
        im.method1();
    }
}

// make sure that the methods have been overriden and implemented in class before using them in main function!!
