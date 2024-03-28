// demonstrating the usage of equals method and overriding it (pretty interesting)

public class equals {

    public static void main(String[] args){

        Person person1 = new Person("hardik",19);
        Person person2 = new Person("hardik",19);

        //usage of the overriden equals for class
        System.out.println(person1.equals(person2));

        // usage of equals in string
        System.out.println("hardik".equals("mandom"));

    }
}


class Person {

    public String name;
    public int age;

    public Person(String n, int a){

        this.name = n;
        this.age = a;
    }

    @Override
    public boolean equals(Object obj){
        
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

}
