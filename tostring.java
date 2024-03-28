// this is an example of overriding the toString method 
// by default the toString method prints the name@hexCode

public class tostring {
    
    public static void main(String[] args){

        Person person = new Person("hardik", 19);
        System.out.println(person.toString());
    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age){
    
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){

        return ("name: "+this.name+" age: "+this.age);
    }
}
