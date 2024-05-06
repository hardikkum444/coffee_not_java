// lets make a simple code to reverse a string using stringbuilder

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        StringBuilder mandom = new StringBuilder(input).reverse();
        System.out.println(mandom);
    }
}
