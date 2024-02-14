import java.util.Scanner;
import java.util.ArrayList;

public class My_custom_algo{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("How many elements would you like in your array?");
		int n1 = scan.nextInt();

		int[] arr = new int[100];

		//ArrayList<Integer> arr = new ArrayList<>();

		for(int i=0;i<n1;i++){
			
			System.out.println("please enter a number");
			arr[i] = scan.nextInt();

		}

		System.out.println("What number would you like to add?");
		int n2 = scan.nextInt();
	
//-------------------------------------------------------------------------------	
//previous logic (rated 2/10 by chatgpt, fair enough)

	// 	int n4=0;

	// 	for(int i=0;i<n1-1;i++){

	// 		if(arr[i]<n2 && arr[i+1]>n2){

	// 			int n4 = i+1;
	// 			//n4=n3;
	// 			for(int j=n1+1;j>=n4;j--){

	// 				arr[j+1] = arr[j];
	// 			}

	// 			arr[n4] = n2;

	// 		}
	// 		if(n2>arr[n1-1]){
	// 			arr[n1] = n2;
	// 		}
	// 		if(n2<arr[0]){

	// 			for(int k=(n1+1);k>=arr[1];k--){

	// 				arr[i+1] = arr[i];
	// 			}
	// 			arr[0] = n2;
	// 			n4 = n1;
	// 		}

	// 	}
	// 	System.out.println();
	// 	System.out.println("here is your new array");

	// 	for(int i=0;i<n4;i++){
	// 		System.out.println(arr[i]);
	// 	}
//-------------------------------------------------------------------------------

//new and better logic rated 8.5/10 by chatgpt 
//this logic works only if we consider the input array to be sorted


		int num=0;
		for(int i=0;i<n1;i++){

			if(arr[i]<n2 && arr[i+1]>n2){

				for(int j=n1-1;j>=i+1;j--){

					arr[j+1] = arr[j];
				}
				arr[i+1]=n2;
				num = n1+1;
				break;
			}
			else if(arr[0]>n2){

				for(int k=n1-1;k>=0;k--){

					arr[k+1] = arr[k];
				}
				arr[0] = n2;
				num = n1+1;
				break;
			}
			else if(n2>arr[n1-1]){

				arr[n1] = n2;
				num = n1+1;
				break;
			}

		}

		System.out.println("So now your updated array is: ");

		for(int i=0;i<num;i++){

			System.out.println(arr[i]);
		}

	 }
}