// mansplaining the usage of abstract class and interfaces

// so you would wanna use an abstract class only when you dont want 100% abstraction, when you also want to use basic class functions

// but when you want to use total abstraction then you should go for using interfaces

// also an important notice, it is compulsary for a java class to implement all the abstract functions in interface, but it aint compulsary for an abstract class --> usage for interface

// also since you cant inherit more than one class in java, interface allows multiple inheritance solving the diamond problem in java

// also abstract methods have to be overriden in java, you cant use then as they are

abstract class Person {
    
    public abstract void introduce();
    
    public void speak(){
        System.out.println("Hola mi amigos, I like Sergio Ramos");
    }
}

class Man extends Person {
    
    @Override
    public void introduce(){
        System.out.println("I smoke weed everyday");
    }
}

class Woman extends Person {
    
    @Override
    public void introduce(){
        System.out.println("I am a wahmen");
    }
}


public class main {
    
    public static void main(String[] args){
        
        Man man = new Man();
        man.introduce();
        man.speak();
        
        Woman woman = new Woman();
        woman.introduce();
        woman.speak();
    }
}
