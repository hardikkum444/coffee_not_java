import java.util.Scanner;

public class ArraySort{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("How many elements would you like in your array?");
		int n1 = scan.nextInt();

		int[] arr = new int[100];

		for(int i=0;i<n1;i++){
			
			System.out.println("please enter a number");
			arr[i] = scan.nextInt();

		}

		System.out.println("What number would you like to add?");
		int n2 = scan.nextInt();

		for(int i=0;i<n1-1;i++){

			if(arr[i]<n2 && arr[i+1]>n2){

				int n3 = i+1;
				for(int j=n1+1;j>=n3;j--){

					arr[j+1] = arr[j];
				}

				arr[n3] = n2;

			}
			if(n2>arr[n1-1]){
				arr[n1] = n2;
			}
		}
		System.out.println();
		System.out.println("here is your new array");

		for(int i=0;i<n1+1;i++){
			System.out.println(arr[i]);
		}

	}
}