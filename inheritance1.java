//this is a simple example of inheritance in java
//also an important point to note is that in cpp there is no diamond problem beacuse of the concept of virtual inheritance

//method overiding can only be done in inheritance 



class example{

	example(){

		System.out.println("Example class has been called!");
	}

	public static void getEx(int n){

		System.out.println("this is your ans --> "+n);
	}
}
public class inheritance1 extends example {

	public static void main(String[] args){

		example E = new example();

		E.getEx(3);
		
	}
}



