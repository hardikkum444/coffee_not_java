//only one class can be declared as public in java (mnore love to cpp)

class Person{

	public int age;
	public String name;

	//non-parametarised constructor
	public Person(){

	}
}

class College{
	public String name;
	public int year;

	//parametarised constructor
	public College(String name_coll, int yr){
		this.name = name_coll;
		this.year = yr;
	}
}


public class constructors_1{

	public static void main(String[] args){

		Person har = new Person();
		har.age = 18;
		har.name = "Hardik Kumawat";

		System.out.println("So the name is: "+har.name);
		System.out.println("and the age is: "+har.age);

		College cse = new College("LPU",2);

		System.out.println("And the college that he goes to is: "+cse.name);
		System.out.println("And he is currently in his "+cse.year+"nd year");
	}
}