//my very own shitty sorting algo

public class Main{
    
    public static void sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=i-1;j>=0;j--){
                
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i=j;
                }
                
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    
    public static void main(String[] args){
        
        int[] arr = {4,2,3,1};
        sort(arr);
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
        
    }
}