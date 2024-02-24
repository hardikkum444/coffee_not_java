//this is demonstrating the usage of hierchihcak inheritance in java

class example{

	example(){

		System.out.println("Example class has been called!");
	}

	public static void getEx(int n){

		System.out.println("this is your ans --> "+n);
	}
}

class example2 extends example{

	example2(){

		System.out.println("Example2 class has been called!");
	}

	public static void getEx(int n){

		System.out.println("this method has been overided! --> "+n );
	}
}

public class inheritance2 extends example2 {

	public static void main(String[] args){

		example E = new example();

		E.getEx(3);

		example2 EE = new example2();

		EE.getEx(4);
		
	}
}



