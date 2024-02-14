//this is the code for integer reversar


import java.util.Scanner;
public class reversing_int{
    
//I tried this method originally which tries to convert an int into string and
//then use the properties of a string to reverse the int 

//howveer that is not possible in java in java strings are immutable 
//which means, that once created they cannto be changed

// public void reverser(int num){
    
//     String ans = String.valueOf(num);
//     //System.out.println(ans.charAt(1));
    
//     for(int i=0;i<ans.length();i++){
//         for(int j=ans.length();j>=0;j--){
            
//             char nnn = ans.charAt(i); 
//             ans.charAt(i) = ans.charAt(j);
//             ans.charAt(j) = nnn;
//         }
//     }

//so we will have to use the operator method

public static void reverser(int num){
    
    int n2 = num%10;
    int n1 = ((num%100)-n2)/10;
    int n3 = (num-((n1*10)+n1))/100;
    
    int newNum = (n2*100)+(n1*10)+(n3*1);
    
    System.out.println("And your reversed number is: "+newNum);
    
    System.out.println("and the numbers printed out separately are : "+ n3 +" "+n1+" "+n2);
}

//this is another method to reverse a integer

public static void reverser_2(int num){
    
    int ans = 0;
    while(num>0){
        
        int n1 = num%10;
        int temp = num/10;
        ans = ans*10+n1;
        num = temp;
    }
    
    System.out.println("And your revered number is :"+ans);
}
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What would you like to reverse?");
        int n1 = scan.nextInt();
        
        reverser(n1);
        
        reverser_2(n1);
        
        
    }
}
