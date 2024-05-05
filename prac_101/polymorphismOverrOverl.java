// runtime polymorphism and polymorphism in general is an exmaple of method overriding
// method overloading is when in the same class multiple methods have same name but different parameters

// here is an exmaple of showing all these things

// another important point to consider is that in method overriding you cannot change parameters

// however in method overloading you can change the parameters

class Animal {
    
    public void makeSound(){
        System.out.println("making sound ...");
    }
}

class Dog extends Animal{
    
    @Override
    public void makeSound(){           //--> example of method overriding, also known as polymorphism        
        System.out.println("woof woof woof ...");
    }
    
    public void age(int a){            
        System.out.println("This good boi's age is "+a);
    }
    
    public void age(int a, String n){   //--> example of method overloading
        System.out.println("This good boi's name is "+n+" and his age is "+a);
    }
}

public class main{
    
    public static void main(String[] args){
        
        Dog dog = new Dog();
        dog.makeSound();
        dog.age(2);
        dog.age(2,"monkey");
    }
}
