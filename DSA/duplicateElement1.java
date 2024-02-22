//duplicate element question
//done using bubble sort
//not great of a time complexity, not accepted on leetcode

public class duplicateElement1{
    
    public static void main(String[] args){
        
        int[] arr = {1,3,4,2,2};
        int n = arr.length;
        
        for(int i=n-1;i>=0;i--){
            
            for(int j=0;j<=i-1;j++){
                
                if(arr[j]>arr[j+1]){
                    
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        boolean ans = true;
        int temp2 = 0;
        
        for(int i=0;i<=n-2;i++){
            
            if(arr[i]==arr[i+1]){
                ans = false;
                temp2 = arr[i];
            }
            
        }
        
        if(!ans){
            System.out.println("repeated number is : "+temp2);
        }
        
        
        
    }
}
