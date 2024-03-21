class A{
    
    static int x = 10;
    int y = 20;
    public int z = 30;

    class B{
        
        void get(){

            System.out.println("x:"+x);
            System.out.println("y:"+y);
            System.out.println("z:"+z);
        }
    }
}

public class danger2{

    public static void main(String[] args){

        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.get();
    }
    
}
