interface anony{
    
    void getName();
    void getAge();

}

public class anonymousClass{

    public static void main(String[] args){

        //creating an object of the interface directly without creating a class
        //this is called anonymous class
        anony obj = new anony(){

            @Override
            public void getName(){
            
                System.out.println("Hardik");
            }

            @Override
            public void getAge(){
            
                System.out.println("18");
            }
        };
        obj.getName();
        obj.getAge();
    }
}
