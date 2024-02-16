import java.util.*;

public class array_2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("how many rows would you like to have? ");
        int r = scan.nextInt();
        System.out.println("how many columns would you like to have? ");
        int c = scan.nextInt();
        
        int[][] arr = new int[r][c];
        
        for(int i=0;i<r;i++){
            
            System.out.println("Row "+(i+1));
            
            for(int j=0;j<c;j++){
                
                arr[i][j] = scan.nextInt();
                System.out.println("accepted");
            }
        }
        
        //printing the out
        
        for(int i=0;i<r;i++){
            
            for(int j=0;j<c;j++){
                
                System.out.print(arr[i][j]+" ");
                
            }
            
            System.out.println();
        }
    }
}