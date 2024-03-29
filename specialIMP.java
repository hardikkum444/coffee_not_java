// method overloading occurs when a class has multiple methods with the same name but different parameters
// method oerriding occurs when a subclass provides a specifinc implementation for a method declared in super class


//In method overriding you cannot change the return type and the parameters, that wont override the function it will only create another one (also use @Override)

public class main {
    public static void main(String[] args){
        System.out.println("hello world");
        
        car newcar = new car();
        lambo newlambo = new lambo();
        
        newcar.printing();
        newlambo.printing();
        
    }
}


class car {
    public void printing(){
        System.out.println("this is a car, vroom");
    }
}

class lambo extends car {

    public void printing(){
        
        System.out.println("this is a lambo, grrrr ");
        
    }
}

// in method overloading you cannot just change the return type and paramenters youll have to chnage both of them at the same time


public class main {
    public static void main(String[] args){
        System.out.println("hello world");
        
        car newcar = new car();
        // lambo newlambo = new lambo();
        
        newcar.printing();
        System.out.println(newcar.printing(3));
        // System.out.println(newlambo.printing(3));
    }
}


class car {
    public void printing(){
        System.out.println("this is a car, vroom");
    }
    
    public int printing(int a){
        System.out.println("Wheels on the bus go round and round "+a);
        return a;
    }
}

// also another name for method overriding is polymorphism
