public class exception2{

    static void getAge(int a)throws ArithmeticException{
    
        if(a<18){

            throw new ArithmeticException("access denied!!!");
        }else{
        
            System.out.println("access granted!!!");
        }
    }

    public static void main(String[] args){

        getAge(14);
    }
}
