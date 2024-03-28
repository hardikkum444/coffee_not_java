//demostrating the use of interface in diamond problem

public class diamondInter implements one,two {
    
    public static void main(String[] args){
        
        diamondInter obj1 = new diamondInter();
        obj1.sameName();
            
    }
        @Override
        public void sameName(){
            System.out.println("no diamond problem here!");
        }
}

interface one {
    public void sameName();
}


interface two {
    public void sameName();
}
