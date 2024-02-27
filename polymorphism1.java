//this is a classic example of polymorphism in java
//we also used the @Override attribute in this program which usally is a good practice

class vehicle {

	public void go(){

		System.out.println("this is a vehicle");
	}
}

class car extends vehicle {

	@Override 
	public void go(){
		System.out.println("the car goes vroom");
	}
}

class bike extends vehicle {

	@Override
	public void go(){
		System.out.println("the bike goes brrrrrr");
	}
}

class boat extends vehicle {

	@Override
	public void go(){
		System.out.println("the boat goes zoooom");
	}
}


public class polymorphism1{

	public static void main(String[] args){

		car Car = new car();
		bike Bike = new bike();
		boat Boat = new boat();

		//polymorphism (all are of vehicle data type

		//all classes are objexts of the object class so -->)
		// vehicle[] arr = {Car,Bike,Boat};
		// or 
		object arr = {Bike, Boat, Car};

		for(object x : arr) {

			x.go();
		}
		
		
	}
}
