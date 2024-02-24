//leet code - container with the most water
//this is the actual answer to which i was very close to
//i just had to use the math.min and math.max function

public class containerWithMostWater2{

	public static void main (String[] args){

	int[] arr = {3,6,7,8,2,3};
	int n = arr.length;

	int p1 = 0;
	int p2 = n-1;

	int area = 0;


	while(p1<p2){

		int minheight = Math.min(arr[p1],arr[p2]);
		area = Math.max(area,(minheight*(p2-p1)));

		if(arr[p1]>arr[p2]){
			p2--;
		}else if(arr[p1]<arr[p2]){
			p1++;
		}else if(arr[p1]==arr[p2]){
			p2--;
			p1++;
		}

	}
		
		

	System.out.println(area);

	
	}
	
}

// int[] arr = {3,6,7,8,2,3};
