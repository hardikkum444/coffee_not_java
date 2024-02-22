//to find the missing number in a given array 
//leetcode easy 268
//time complexity O(n^2)

public class missingApp1 {
        
    public static void main (String[] args){
        
        int[] arr = {1,2,0,3,4};
        int n = 5;
        
        for(int i=0;i<=n;i++){
            
            boolean ans = false;
            
            for(int j=0;j<n;j++){
                
                if(arr[j] == i){
                    ans = true;
                }
                
            }
            if (ans == false){
                    
                System.out.println("Missing number: "+i);
            
                
            }
        }
            
            
    }
}
