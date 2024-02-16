//performing addition in 2D array to every element
//can also perform any other shit as well

import java.util.*;

public class array_2D_2 {
    public static void main(String[] args) {


    	Scanner scan = new Scanner(System.in);

    	System.out.println("Rows: ");
    	int r = scan.nextInt();
    	System.out.println("columns: ");
    	int c = scan.nextInt();

    	int[][] arr = new int[r][c];

    	for(int i=0;i<r;i++){

    		for(int j=0;j<c;j++){

    			int n1 = scan.nextInt();
    			arr[i][j] = n1+1; //performing addition

    			System.out.println("accepted");
    		}
    	}

    	    for(int i=0;i<r;i++){

    		for(int j=0;j<c;j++){

    			System.out.print(arr[i][j]+" ");

    		}

    		System.out.println();

    	}

        
    }
}