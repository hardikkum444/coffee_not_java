//basic usage of arrays in java
import java.util.*;


// public class arrays_1{

// 	public static void main(String[] args){

// 		Scanner scan = new Scanner(System.in);
// 		int gpa[] = new int[5]; //actually means 0-4

// 		//or int gpa[] = {1,2,3,4,5} automatically creates an array of 4(5) size

// 		for(int i=0;i<5;i++){
			
// 			System.out.println("Enter "+i+" gpa --> ");
// 			gpa[i] = scan.nextInt();
// 		}

// 		for(int i=0;i<5;i++){
// 			System.out.println(gpa[i]);
// 		}
// 	}
// }


//take an array input from the user and give them the index of the 
//number they are looking for **********

public class arrays_1{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("How many elemets does your array have?");
	int num = scan.nextInt();

	int[] arr = new int[num];

	for(int i=0;i<num;i++){
		System.out.println("Please enter the "+i+"th elemnt");
		arr[i] = scan.nextInt();
	}

	System.out.println("what would you like to search for?");
	int search = scan.nextInt();

	boolean flag = false;
	int ans =0;

	for(int i =0;i<num;i++){
		if (arr[i] == search){
			flag = true;
			ans = i;
		}
		else{
			//do nothing
		}
	}

	if(flag){
		System.out.println("your element has been found in the "+ans+" index");
	}else{
		System.out.println("Your element does not exist in the given array");
	}

}
}