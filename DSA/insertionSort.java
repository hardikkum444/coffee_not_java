//trying insertion sort 
// a little harder

//this is my version of the code but for some reason its not correct
//however its functioning perfectly and giving the right output

public class insertionSort {
    
    public static void main(String[] args){
        
        int[] arr = {5, 4, 3, 2, 1};

        int size = arr.length;
        
        for(int i=0;i<size;i++){
            
            int pos = i;
            
            for(int j=i-1 ;j>=0;j--){
                
                if(arr[j]>arr[pos]){
                    
                    int store = arr[j];
                    arr[j] = arr[pos];
                    arr[pos] = store;
                    pos = j;
                    
                }
            }
            
        }
            for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
}