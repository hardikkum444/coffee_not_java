//leet code - container with the most water
//this was my attempt but it was too long and didnt work as expected 

public class containerWithMostWater{

	public static void main (String[] args){

	int[] arr = {3,6,7,8,2,3};
	int n = arr.length;

	int p1 = 0;
	int p2 = n-1;

	int area = 0;

	for( int i =0;i<n;i++){

		if(arr[p1]>arr[p2]){

			if(arr[p2]*(p2-p1)>area){

				area = arr[p2]*(p2-p1);
			}
			p2--;
		} else if(arr[p1]<arr[p2]){

			if (arr[p1]*(p2-p1)>area) {
				area = arr[p1]*(p2-p1);
			}
			p1++;
		}else if(arr[p1]==arr[p2]){

			if(arr[p1+1]>arr[p2-1]){
				p1++;
			}else if(arr[p1+1]<arr[p2-1]){
				p2--;
			}else{
				area = arr[p1]*arr[p2];
				break;
			}
		}else if(p1>p2){
			break;
		}
	}
		
	
		System.out.println(area);
	}
	
}

// int[] arr = {3,6,7,8,2,3};
