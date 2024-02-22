//missing number in a given array 
// better app
// time complexity O(n)

public class missingApp2 {
    
    static int findSum(int n){
        
        int sum = 0;
        for(int i =0;i<=n;i++){
            
            sum+=i;
        }
        
        return sum;
        
    }
    
    static int findSum2(int[] arr){
        
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args){
        
        int[] arr = {0,2,3};
        int n = 3;
        
        int ans = findSum(n);
        
        int ans2 = findSum2(arr);
        
        int ans3 = ans - ans2;
        
        if(ans3 == 0){
            
            System.out.println("no number missing");
        }else{
            System.out.println("missing number : "+ans3);
        }
        
        
        
    }
}
