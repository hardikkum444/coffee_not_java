//simple self made question for the practice of constructors 

import java.util.Scanner;

class shape{

	public int sides;

	//non-parametarised constructor
	public shape(){

		Scanner scan = new Scanner(System.in);

		System.out.println("how many sides does your shape have?");
		this.sides = scan.nextInt();

		scan.close();
	}
}

public class constructors_2{

	public static void main(String[] args){

		shape shape1 = new shape();
		if(shape1.sides == 1){

			System.out.println("shape doesnt exist");
		}
		else if(shape1.sides ==2){

			System.out.println("shape doesnt exist");
		}
		else if (shape1.sides == 3){

			System.out.println("Your shape is a triangle");
		}
		else if(shape1.sides == 4){
			
			System.out.println("Your shape can be a square or a rectangle");
		}

	}

}