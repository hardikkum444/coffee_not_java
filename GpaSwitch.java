//grade switch statements

import java.util.*;

public class main{
    
    public static void gpa(int num){
            
        int n1 = num/10;
        String grade = "";
        
        switch(n1){
            
            case 0:
                grade = "E";
                break;
            case 1:
                grade = "D";
                break;
            case 2:
                grade = "C";
                break;
            case 3:
                grade = "B";
                break;
            case 4:
                grade = "A";
                break;
            case 5:
                grade = "A+";
                break;
            default:
                System.out.println("Nothing");
                break;
        }
        
        System.out.println("Your grade is: "+grade);
    }
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        
        gpa(n1);
        
        
    }
    
}









