//This is an excellent example based on the usage of args in java
//Whilst running this java file 

//run it like --> java WhatAreArgs arg1 arg2 arg3

public class WhatAreArgs{

	public static void main(String[] args){

		if(args.length > 0){

			for(int i =0;i<args.length;i++){

				System.out.println("Argument "+(i+1)+": "+args[i]);
			}
		}
		else{

			System.out.println("No arguments provided");
		}
	}

} 