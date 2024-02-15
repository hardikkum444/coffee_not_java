//using the concept of constructors and enums in one

//this is one wierd-ass code but bear with me!

import java.util.*;

enum coffee{

	small(4.5),
	medium(6.5),
	large(9.0);

	private double price;

	//this constructor is compeletely necessary as without it 
	//the small(5.6) stuff wont make sense to the compiler

	coffee(double price){
		this.price = price;
	}

	public void getPrice(){

		System.out.println(this.price);
	}

}


public class enums_2 {
    public static void main(String[] args) {

    	coffee cof = coffee.medium;

    	cof.getPrice();
        

    }
}