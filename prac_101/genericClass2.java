// another usage

import java.util.*;

public class Main <T,U>{
    
    private T obj1;
    private U obj2;
    
    public Main(T o1, U o2){
        this.obj1 = o1;
        this.obj2 = o2;
    }
    
    public T mandom(){
        return this.obj1;
    }
    
    public U mandom2(){
        return this.obj2;
    }
    
    public static void main(String[] args){
        
        Main<String,Integer> man = new Main<>("Hardik",20);
        System.out.println(man.mandom());
        System.out.println(man.mandom2());
    }
}

// making a pair data structure using generic class 
// import java.util.*;

// public class genericClass2<T,U>{

//     private T obj1;
//     private U obj2;

//     public genericClass2(T man1 , U man2){
//         this.obj1 = man1;
//         this.obj2 = man2;   
//     }

//     public T getFirst(){
//         return this.obj1;
//     }

//     public U getSecond(){
//         return this.obj2;
//     }

//     public static void main(String[] args){
        
//         genericClass2<String, Integer> mandom = new genericClass2<>("hardik" , 20);
//         System.out.println(mandom.getFirst());
//         System.out.println(mandom.getSecond());
        
//     }
// }
