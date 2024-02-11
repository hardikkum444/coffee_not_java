//implementing the logic of 2D arrays
//taking input and then printing the twoDarray

import java.util.*;

public class arrays_2{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("How many columns would you like to have");
		int col = scan.nextInt();
		System.out.println("How many rows would you like to have");
		int rows = scan.nextInt();

		int[][] arr = new int[rows][col];

		for(int i=0;i<rows;i++){
			
			for(int j=0;j<col;j++){

				arr[i][j] = scan.nextInt();

			}

		}

		//printing it out 

		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){

				System.out.print(arr[i][j]+" ");  //remeber NOT to add the ln in println
			}
			System.out.println();
		}
	}
}