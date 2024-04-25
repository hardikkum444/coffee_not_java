// using and defining a custom exception

class myexception extends Exception{

    public myexception(String message){
        super(message);
    }
}

public class prac4 {

    public static void mess(String code) throws myexception{

        if(code.equals("mandom")){
            System.out.println("Eh ya whats good fam?!");
        }else{
            throw new myexception("Error, man not identified!");
        }
    } 

    public static void main(String[] args){

        try{
            mess("mandom");
        }catch(myexception e){
            System.out.println(e.getMessage());
        }
    }
}
