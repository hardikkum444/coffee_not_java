interface mandom {

    default void getName(){
    
        System.out.println("this is the getname function");
    }
    default void printing(){

        System.out.println("this is the printing function");
    }
}

public class anonymousClass2 {

    public static void main(String[] args){
        
        mandom obj = new mandom(){

            @Override
            public void getName(){

                System.out.println("getting your name");
            }

            @Override
            public void printing(){

                System.out.println("Printing stuff");
            }
        };

        obj.getName();
        obj.printing();
        
        
    }

}

