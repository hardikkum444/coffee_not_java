// checking if a sentence is a palindrom in java

import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String input2 = input.toLowerCase();
        String input3 = input2.replaceAll("[,\\s]","");
        StringBuilder mandom = new StringBuilder(input3).reverse();
        
        if(input3.equals(mandom.toString())){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
    }
}
