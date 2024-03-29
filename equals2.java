// another short yet important example

class Person {
    
    int age;
    int heght;
    
    Person (int age, int height){
        System.out.println("hi i am a person!");
        this.age = age;
        this.heght = height;
    }
    
    @Override
    public boolean equals (Object obj){
        
        Person person = (Person) obj;
        return age == person.age && heght == person.heght;
    }
}

public class equals2 {
    public static void main(String[] args){
        
        Person person1 = new Person(14,180);  
        Person person2 = new Person(19,180);
        
        System.out.println(person1.equals(person2));
        
    }
}
