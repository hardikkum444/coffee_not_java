//explaining the usage of all the different types of constructors

class iden{

	public int age;

	//it is always necessary to create a constructor even if its empty
	public iden(){

	}

	//copy constructor
	public iden(iden other){

		this.age = other.age;
	}

	//parametarised constructor
	public iden(String name){

		System.out.println("Your name is "+name);
	}

//------------------------------------------------------------------------------	

	private iden(boolean flag){

		//this is a private constructor, which can only be used inside the class of origin 
		if(flag){
			System.out.println("the value is true");
		}else{
			System.out.println("the value is false");
		}
	}

	public static iden inst(boolean flag){
		return new iden(flag);
	}

//------------------------------------------------------------------------------


}

public class constructors_3{

	public static void main(String[] args){

		iden har = new iden();
		har.age = 21;

		iden har2 = new iden(har);
		System.out.println("copy constructor value --> "+har2.age);

		iden har3 = new iden("hardik");

		iden inst1 = iden.inst(true);
		iden inst2 = iden.inst(false);

	}
}