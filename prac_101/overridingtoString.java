// lets discuss the usage of toString() keyword in general
// the toString() method in java is used to print the name of the class along with the hexcode of that class
// getClass().getName() + '@' + Integer.toHexString(hashCode()) this is the default application of the toString() method which by default belongs to the object class

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override  // --> overriding the toString() implementation
    public String toString(){
        return("Name of this person is "+this.name+" and age of this person is "+this.age);
    }
    
}

public class main{
    
    public static void main(String[] args){
        
        Person person = new Person("Hardik", 20);
        System.out.println(person.toString());  // --> default implementation prints "Person@cac736f"
    }
}
