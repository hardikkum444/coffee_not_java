public class multipleExp1{

    public static void main(String[] args){

        try{
            int[] a = new int[5];
            a[100] = 30/0;
        }

        catch (ArithmeticException e){
        
            System.out.println("ArithmeticException");
        }

        catch (ArrayIndexOutOfBoundsException f){
        
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch (Exception g){

            System.out.println("exception");
        }

        System.out.println("rest of the code");


    }
}
