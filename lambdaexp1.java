//dynamic method dispatching
//demonstrating the usage of lambda expression in java

@FunctionalInterface
interface open{

    void getName(int a);
}

public class lambdaexp1{

    public static void main(String[] args){

        int a = 8;
        open obj = (b)->{ //no need to write "int b" also
        
            System.out.println("Usage of lambda expressions in java "+a);
        };
        //or a one liner like this:
        //open obj = ()->{System.out.println("blah blah blah")};

        obj.getName(a);
    }

}
