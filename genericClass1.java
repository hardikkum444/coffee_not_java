// sample usage of generic class
import java.util.*;

public class genericClass1 <T extends Number> {

    private T length;
    private T width;

    public genericClass1(T l, T w){
        this.length = l;
        this.width = w;
    }

    public int calculateArea(){

        return this.length.intValue() * this.width.intValue();
    }

    public int calculatePerimeter(){

        return (this.length.intValue()*2)+(this.width.intValue()*2);
    }

    public static void main(String[] args){

        genericClass1<Integer> mandom = new genericClass1<>(5,3);
        System.out.println(mandom.calculateArea());
        System.out.println(mandom.calculatePerimeter());
    }
}
