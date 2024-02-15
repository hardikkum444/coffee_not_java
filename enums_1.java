// demonstaring the usage of enums

import java.util.*;

public class enums_1{

	enum days{

		Monday, Tuesday, Wednesday
	}
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("which day would you like to choose");

		String ans = scan.next();
		

		switch(ans){

		case "Mon":
			days day = days.Monday;
			
			System.out.println(day);
			break;
		default:
			System.out.println("nothing");
			break;
		}
		// and the casees can continue
		//you get the general ides right?
		//enums are used to store some constants that we want to define


		

	}
}