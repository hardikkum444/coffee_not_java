// now demonstrating the usage and overriding of the equals() method

//default implementation of the equals method:
// public boolean equals(Object obj) {
//     return (this == obj);
// }

// the implementation in string class however already overrides this method giving true despite both the string being in different memory locations

class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override 
    public boolean equals(Object obj){
        Person mandom = (Person) obj;
        
        return this.age==mandom.age && this.name.equals(mandom.name);
    }
}

public class main{
    
    public static void main(String[] args){
        
        Person person1 = new Person("Hardik", 20);
        Person person2 = new Person("Samuel", 21);
        Person person3 = new Person("Hardik", 20);
        
        System.out.println(person2.equals(person1));
        System.out.println(person3.equals(person1));  // --> this also prints false (in the default implementation) since both of the objects are in different memory locations
    }
}
