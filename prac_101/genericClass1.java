// basic usage

import java.util.*;

class Calc <T extends Number>{
    
    private T num1;
    private T num2;
    
    public Calc(T n1, T n2){
        this.num1=n1;
        this.num2=n2;
    }
    
    public int calculate(){
        return (this.num1.intValue()*this.num2.intValue());
    }
}

public class main{
    
    public static void main(String[] args){
        
        Calc<Double> mandom = new Calc<>(3.2,4.5);
        System.out.println(mandom.calculate());
    }
}
