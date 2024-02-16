//pallindrome checker 

import java.util.*;

public class palindrome{
    
    public static void  palin(String ans){
        
        int n = ans.length();
        int n2 = n-1;
        
        boolean ans2 = true;
        
        for(int i=0;i<n2/2;i++){
            
            if(ans.charAt(i) == ans.charAt(n2--)){
                ans2 = true;
            }else{
                ans2 = false;
                break;
            }
        }
        
        if(ans2){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        
    }
    
    public static void main(String[] args){
        
        palin("refer");
    }
}