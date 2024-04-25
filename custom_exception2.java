class myexception extends Exception{

    public myexception(String message){

        super(message);
    }
}

public class customexc{
    
    public static void main(String[] args){

        int[] arr = new int[5];


        try{
            
            if(arr.length<7){
                throw new myexception("Error: Too small!!");
            }

            System.out.println(arr[6]);
            System.out.println("done");


        }catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Dont exist "+e.getMessage());
        
        }catch(myexception e){
            System.out.println(e.getMessage());
        }
    }
}
