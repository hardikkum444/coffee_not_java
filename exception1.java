public class exception1{
    public static void main(String[] args){
    
        try{
            
            int arr[] = {1,2,3,4,5};
         
            System.out.println(arr[10]);  //trying to access the 11th element of the array

        }catch(ArrayIndexOutOfBoundsException e){
        
            System.out.println("aray out of bounds");
        
        }finally{
            
            System.out.println("Array created");
        }
    }
}
