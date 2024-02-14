import java.util.Scanner;

public class ArrayRev{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("How many elements would you like in your array?");
		int n1 = scan.nextInt();

		int[] arr = new int[n1];

		for(int i=0;i<n1;i++){
			
			System.out.println("please enter a number");
			arr[i] = scan.nextInt();

		}

		System.out.println("Which number would you like to search for?");
		int n2 = scan.nextInt();

		for(int i=0;i<n1;i++){

			if(arr[i]==n2){
				System.out.println("Your number has been found at the "+(i+1)+" place and "+i+" index");
				System.exit(0);
			}
		}
		System.out.println("Your number doesnt exist in the array");

	}
}