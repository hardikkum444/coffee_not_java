// we use static functions to prevent creating an instance of the same class in which we have created the function like below

public class static1{

    void add (int a, int b){
    
        System.out.println(a+b);
    }


    public static void main(String[] args){
        
        // add(3,2);
        //

        static1 mandom = new static1();
        mandom.add(2,3);

    }
}

// instead we can use static functions

public class static1{

    static add (int a, int b){
    
        System.out.println(a+b);
    }


    public static void main(String[] args){
        
                      
        add(2,3);

    }
}


