//this is imp

//STATIC methods  and variables
//static methods or variables can only be accessed within that class only
//also they can be accessed using both objects or direclty but it is recommended to do so using class name rather than objects

//usage of a static block used to initialize a static variables
import java.util.*;

public class static2 {

    static int num;

    static {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n1 = scan.nextInt();
        num = n1;
        System.out.println("the value give in "+num);
    }

    // Constructor has a lesser priority than static block
    static2(){
    
        System.out.println("Constructor has been called");
    }

    public static void main(String[] args){

        static2 newdom = new static2();
    }
}

// look carefully, we have accessed static method using both techniques

public class main{
    
    static void display(){
        System.out.println("message has been displayed");
    }
    
    public static void main(String[] args){
        
        main.display();
        main obj1 = new main();
        obj1.display();
    }
}
