class A{
    
    static int x = 10;
    int y = 20;
    private static int z = 30;

    static class B{
    
        void get(){
        
            System.out.println("value of x is "+x);
            System.out.println("value of z is "+z);
        }
    }

}

public class danger{
    public static void main(String[] args){

        A.B object = new A.B();
        object.get();

    }
}
