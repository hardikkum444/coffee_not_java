//leetcode 122 best time to buy and sell II
//ill be honest, i looked at one line of the discussions and it kinda gave it away 
//but in the brighter side, i did code the entire logic!
//done and dusted


public class test{

	public static void main(String[] args){

		int[] arr = {7,6,4,2,4};
		int n = arr.length;

		int buy  = 0;
		boolean bought = false;
		boolean sold = true;
		int sell = 0;
		int profit = 0;

		for(int i=0;i<n;i++){

		if((i+1)<(n)){
			if(arr[i]<arr[i+1]){

				if(sold){
				 buy = arr[i];
				 bought = true;
				 sold = false;
				 // System.out.println("buy "+buy);
				}
				 
			}else if(arr[i]>arr[i+1]){

				if(bought){
					sell = arr[i];
					sold = true;
					bought = false;
					profit+=(sell-buy);
					// System.out.println("sell "+sell);
				}
			}
		}
		}

		if(!sold){
			profit+=(arr[n-1]-buy);
		}

		System.out.println(profit);
		
	}
}
