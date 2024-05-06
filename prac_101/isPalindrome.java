// lets waste our time by doing this code for checking if palindrome

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        StringBuilder mandom = new StringBuilder(input).reverse();
        String ans = mandom.toString();
        
        if(ans.equals(input)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
