// now i shall demonstrate the usage of super keyword for calling a constructor

class Animal{
    
    public String type;
    
    public Animal(String type){
        this.type = type;
    }
    
    public void sound(){
        System.out.println("Animal making sound --> ");
    }
}

class Dog extends Animal {
    
    public String breed;
    
    public Dog(String type, String breed){
        super(type); // --> this is using super keyword for calling constructot
        this.breed = breed;
    }
    
    public void makeSound(){
        super.sound(); // --> this is using super keyword for calling normal parent class method
        System.out.println("woof woof woof...");
    }
}

public class main {
    
    public static void main(String[] args){
        
        Dog dog = new Dog("Mandom", "German Shephard");
        
        System.out.println(dog.type);
        dog.makeSound();
    }
}
