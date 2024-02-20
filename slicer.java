//email slicer in java
//without the use of iterating using loops
//done just using the concept of string method or string functions

import java.util.Scanner;

public class slicer {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your email");
        
        String email = scan.nextLine();
        
        boolean ans = false;
        int s =0;
        int c =0;
        
        if(email.contains("@")){
            
            s = email.indexOf("@");
            
            if(email.contains(".com")){
                
                c = email.indexOf(".");
                ans = true;
            }
            
        }
        
        if(ans){
            
            System.out.println("Username: "+email.substring(0,s));
        
            System.out.println("domain: "+email.substring(c,email.length()));
        
            // System.out.println(email.charAt(0));
        }else{
            System.out.println("invalid email given");
        }
        
        
    }
}

//*hardikkumawat444@gmail.com