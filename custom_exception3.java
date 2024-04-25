# printing stack trace

public class prac2 {

    public static void main(String[] args){

        try{
            System.out.println(5/0);
        }catch(ArithmeticException e){

            // System.out.println("WhAt?? "+e.getMessage());
            e.printStackTrace();
        }
    }
}
