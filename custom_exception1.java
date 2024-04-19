class myexception extends Exception {
    
    public myexception(String message){
        super(message);
    }
}

public class custom_exception1{

    public static void check(int num) throws myexception{

        if(num>10){
            throw new myexception("Error: too big of a number!!");
        }else{
            System.out.println("number accepted");
        }
    }

    public static void main(String[] args){

        try{
            check(6);
        }catch(myexception e){
            System.out.println(e.getMessage());
        }
    }
}
